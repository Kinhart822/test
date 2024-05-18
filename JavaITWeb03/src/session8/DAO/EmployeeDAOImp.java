/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session8.DAO;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.management.RuntimeErrorException;
import session8.Employee;
import session8.JDBCUtils;


public class EmployeeDAOImp implements EmployeeDAO {
	public static void main(String[] args){
		EmployeeDAO employeeDAO = new EmployeeDAOImp();
		try {
			List<Employee> employees = employeeDAO.readAll();
			System.out.print(employees);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    @Override
	public boolean create(Employee employee) throws ClassNotFoundException {
    	try (Connection conn = JDBCUtils.getConnection()){

            //3. create statement
//            Statement stm = conn.createStatement();
//
//            //4. run
//            String sql = """
//                    INSERT INTO Employees (
//                    	employee_id,
//                    	first_name,
//                    	last_name,
//                    	email,
//                    	hire_date,
//                    	job_id,
//                    	salary)
//                    VALUES (
//                    	207,
//                    	N'huy',
//                    	N'huy',
//                    	N'huy@gmail.com',
//                    	'2002-06-07',
//                    	N'AC_MGR',
//                    	12008.00
//                    );
//                    """;
//            stm.executeUpdate(sql);
            
            
            StringBuilder sql = new StringBuilder();
            sql.append("");
            sql.append("INSERT INTO Employees (");
            sql.append(" employee_id,");
            sql.append(" first_name,");
            sql.append(" last_name,");
            sql.append(" email,");
            sql.append(" hire_date,");
            sql.append(" job_id,");
            sql.append(" salary)");
            sql.append(" VALUES (?,?,?,?,?,?,?)");
            
            PreparedStatement sts = conn.prepareStatement(sql.toString());
            sts.setInt(1, employee.getEmployeeId());
            sts.setString(2, employee.getFirstName());
            sts.setString(3, employee.getLastName());
            sts.setString(4, employee.getEmail());

            java.util.Date hireDateInput = employee.getHireDate();
            sts.setDate(5, new java.sql.Date(hireDateInput.getTime()));
            sts.setString(6, employee.getJobId());
            sts.setDouble(7, employee.getSalary());
            
            int rows = sts.executeUpdate();
            if (rows >= 1) {
            	System.out.println("Success");
            	return true;
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
	
    @Override
    public List<Employee> readAll() throws SQLException, ClassNotFoundException {
        List<Employee> empList = new ArrayList<>();

        Connection con = JDBCUtils.getConnection();
        //Step3:
        Statement st = con.createStatement();

        //Step4:
        st.execute("SELECT * FROM Employees");
        ResultSet rs = st.getResultSet();
        while(rs.next()){
            int id = rs.getInt(1);
            String firstName = rs.getString("first_name");
            String lastName = rs.getString(3);
            String email = rs.getString(4);
            String phone = rs.getString(5);
            Date hireDate = rs.getDate(6);

            Employee emp = new Employee();
            emp.setEmployeeId(id);
            emp.setFirstName(firstName);
            emp.setLastName(lastName);
            emp.setEmail(email);
            emp.setPhoneNumber(phone);
            emp.setHireDate(hireDate);

            empList.add(emp);
        }
        return empList;
    }

    @Override
	public int createAllByBatch(List<Employee> employees, int batchSize) throws ClassNotFoundException {
    	Connection conn = null;

        try {
            conn = JDBCUtils.getConnection();

            //Create
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO Employees (");
            sql.append("        employee_id,");
            sql.append("        first_name,");
            sql.append("        last_name,");
            sql.append("        email,");
            sql.append("        hire_date,");
            sql.append("        job_id,");
            sql.append("        salary)");
            sql.append(" VALUES (?,?,?,?,?,?,?)");
            PreparedStatement stm = conn.prepareStatement(sql.toString());


            long begin = System.currentTimeMillis();
            
//            conn.setAutoCommit(false);
//            for (Employee run : employees) {
//                stm.setInt(1, run.getEmployeeId());
//                stm.setString(2, run.getFirstName());
//                stm.setString(3, run.getLastName());
//                stm.setString(4, run.getEmail());
//
//                java.util.Date hireDateInput = run.getHireDate();
//                stm.setDate(5, new java.sql.Date(hireDateInput.getTime()));
//                stm.setString(6, run.getJobId());
//                stm.setDouble(7, run.getSalary());
//                
//                stm.addBatch();
//            }
//            stm.executeBatch();
//            conn.commit();
            
            conn.setAutoCommit(false);
            int count =0;
          for (Employee run : employees) {
              stm.setInt(1, run.getEmployeeId());
              stm.setString(2, run.getFirstName());
              stm.setString(3, run.getLastName());
              stm.setString(4, run.getEmail());

              java.util.Date hireDateInput = run.getHireDate();
              stm.setDate(5, new java.sql.Date(hireDateInput.getTime()));
              stm.setString(6, run.getJobId());
              stm.setDouble(7, run.getSalary());
              
              stm.addBatch();
              if(count % batchSize ==0) {
            	  stm.executeBatch();
                  conn.commit();
              }
              count++;
          }

          
            long end = System.currentTimeMillis();

            System.out.println("Runtime: " + (end - begin)/1000);
            conn.setAutoCommit(true);

        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                    conn.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }

        return 0;
	}

	@Override
    public Employee readById(int id) throws ClassNotFoundException {
    	 Employee employee = new Employee();
         try (Connection connection = JDBCUtils.getConnection()){

             //step3: create statement
             Statement statement = connection.createStatement();

             //step4. run sql
             statement.execute("SELECT * FROM Employees WHERE employee_id = " + id);
             ResultSet resultSet = statement.getResultSet();
             while (resultSet.next()) {
                 employee.setEmployeeId(resultSet.getInt(1));
                 employee.setFirstName(resultSet.getString(2));
                 employee.setLastName(resultSet.getString(3));
             }
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
         return employee;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

	@Override
	public boolean update(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	} 
	
	@Override
    public int createAll(List<Employee> employees) throws ClassNotFoundException {
        Connection conn = null;

        try {
            conn = JDBCUtils.getConnection();

            //Create
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO Employees (");
            sql.append("        employee_id,");
            sql.append("        first_name,");
            sql.append("        last_name,");
            sql.append("        email,");
            sql.append("        hire_date,");
            sql.append("        job_id,");
            sql.append("        salary)");
            sql.append(" VALUES (?,?,?,?,?,?,?)");
            PreparedStatement stm = conn.prepareStatement(sql.toString());


            //run
            conn.setAutoCommit(false);
            for (Employee run : employees) {
                stm.setInt(1, run.getEmployeeId());
                stm.setString(2, run.getFirstName());
                stm.setString(3, run.getLastName());
                stm.setString(4, run.getEmail());

                java.util.Date hireDateInput = run.getHireDate();
                stm.setDate(5, new java.sql.Date(hireDateInput.getTime()));
                stm.setString(6, run.getJobId());
                stm.setDouble(7, run.getSalary());

                stm.executeUpdate();
            }
            conn.commit();
            conn.setAutoCommit(true);

        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                    conn.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }

        return 0;
	}
	
	@Override
	public List<Employee> readInfoAll() throws ClassNotFoundException, SQLException {
		List<Employee> empList = new ArrayList<>();

        Connection con = JDBCUtils.getConnection();
        //Step3:
        Statement st = con.createStatement();

        //Step4:
        st.execute("SELECT * FROM Employees");
        ResultSet rs = st.getResultSet();
        while(rs.next()){
            int id = rs.getInt(1);
            String firstName = rs.getString("first_name");
            String lastName = rs.getString(3);
            String email = rs.getString(4);
            String phone = rs.getString(5);
            Date hireDate = rs.getDate(6);

            Employee emp = new Employee();
            emp.setEmployeeId(id);
            emp.setFirstName(firstName);
            emp.setLastName(lastName);
            emp.setEmail(email);
            emp.setPhoneNumber(phone);
            emp.setHireDate(hireDate);

            empList.add(emp);
        }
        return empList;
	}
}
