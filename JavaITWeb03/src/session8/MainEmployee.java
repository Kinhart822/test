/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session8;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import session8.DAO.EmployeeDAO;
import session8.DAO.EmployeeDAOImp;

public class MainEmployee {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
//		try {
//			findAllEmployee();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		 	EmployeeDAO dao = new EmployeeDAOImp();

//	        Employee employee1 = new Employee();
//	        employee1.setEmployeeId(210);
//	        employee1.setFirstName("Huy");
//	        employee1.setLastName("Pham");
//	        employee1.setEmail("abc1@gmail.com");
//	        employee1.setHireDate(new java.util.Date());
//	        employee1.setJobId("AC_MGR");
//	        employee1.setSalary(3000.0d);
//
//
//	        Employee employee2 = new Employee();
//	        employee2.setEmployeeId(211);
//	        employee2.setFirstName("Huy");
//	        employee2.setLastName("Pham");
//	        employee2.setEmail("abc2@gmail.com");
//	        employee2.setHireDate(new java.util.Date());
//	        employee2.setJobId("AC_MGR");
//	        employee2.setSalary(3000.0d);
//
//	        Employee employee3 = new Employee();
//	        employee3.setEmployeeId(210);
//	        employee3.setFirstName("Huy");
//	        employee3.setLastName("Pham");
//	        employee3.setEmail("abc3@gmail.com");
//	        employee3.setHireDate(new java.util.Date());
//	        employee3.setJobId("AC_MGR");
//	        employee3.setSalary(3000.0d);
//
//	        List<Employee> employees = List.of(employee1, employee2, employee3);
//
//	        int count = dao.createAll(employees);
//	        System.out.println(count);
	        
//	        List<Employee> employees = new ArrayList<>();
//	        for(int i = 0; i < 100000; i++) {
//	            Employee employee11 = new Employee();
//	            employee11.setEmployeeId(210 + i);
//	            employee11.setFirstName("Huy");
//	            employee11.setLastName("Pham");
//	            employee11.setEmail("abc"+i+"1@gmail.com");
//	            employee11.setHireDate(new java.util.Date());
//	            employee11.setJobId("AC_MGR");
//	            employee11.setSalary(3000.0d);
//
//	            employees.add(employee11);
//	        }
//	        int count1 = dao.createAll(employees);
//	        System.out.println(count1);
//	}

		 	List<Employee> employees = new ArrayList<>();
	        for(int i = 0; i < 1000; i++) {
	            Employee employee11 = new Employee();
	            employee11.setEmployeeId(210 + i);
	            employee11.setFirstName("Huy");
	            employee11.setLastName("Pham");
	            employee11.setEmail("abc"+i+"1@gmail.com");
	            employee11.setHireDate(new java.util.Date());
	            employee11.setJobId("AC_MGR");
	            employee11.setSalary(3000.0d);

	            employees.add(employee11);
	        }
	        dao.createAllByBatch(employees, 5);
	}
//	private static void findAllEmployee() throws ClassNotFoundException, SQLException {
//		// TODO Auto-generated method stub
//		//Step1:
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//
//        //Step2: Connect to Database
//        String url = "jdbc:sqlserver://localhost:1433;databaseName=HR_DB;;encrypt=true;trustServerCertificate=true";
//        String username = "sa";
//        String password = "kinhart822";
//        Connection con = DriverManager.getConnection(url, username, password);
//
//        //Step3:
//        Statement st = con.createStatement();
//
//        //Step4:
//        st.execute("SELECT * FROM Employees");
//        ResultSet rs = st.getResultSet();
//        while(rs.next()){
//            int id = rs.getInt(1);
//            String firstName = rs.getString("first_name");
//            String lastName = rs.getString(3);
//            String email = rs.getString(4);
//            String phone = rs.getString(5);
//            Date hireDate = rs.getDate(6);
//
//            Employee emp = new Employee();
//            emp.setEmployee_id(id);
//            emp.setFirst_name(firstName);
//            emp.setLast_name(lastName);
//            emp.setEmail(email);
//            emp.setPhone_number(phone);
//            emp.setHire_date(hireDate);
//
//            System.out.println(emp);
//		
//        }
//        
//	}
	
//	private static List<Employee> findAllEmployee() throws ClassNotFoundException, SQLException, IOException {
//    	List<Employee> empList = new ArrayList<>();
//
//        //Step1: Tải JDBC của MS-SQL (Các class thực hiện)
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//
//        //Step2: Connect to Database
//        String url = "jdbc:sqlserver://localhost:1433;databaseName=HR_DB;encrypt=true;trustServerCertificate=true";
//        String username = "sa";
//        String password = "123456";
//        Connection con = DriverManager.getConnection(url, username, password);
//
//        //Step3:
//        Statement st = con.createStatement();
//
//        //Step4:
//        st.execute("SELECT * FROM Employees");
//        ResultSet rs = st.getResultSet();
//        while(rs.next()){
//            int id = rs.getInt(1);
//            String firstName = rs.getString("first_name");
//            String lastName = rs.getString(3);
//            String email = rs.getString(4);
//            String phone = rs.getString(5);
//            Date hireDate = rs.getDate(6);
//
//            Employee emp = new Employee();
//            emp.setEmployeeId(id);
//            emp.setFirstName(firstName);
//            emp.setLastName(lastName);
//            emp.setEmail(email);
//            emp.setPhoneNumber(phone);
//            emp.setHireDate(hireDate);
//
//            empList.add(emp);
//        }
//        return empList;
//    }
	private static List<Employee> findAllEmployee() throws ClassNotFoundException, SQLException, IOException {

        List<Employee> employees = new ArrayList<>();

        Connection conn = JDBCUtils.getConnection();

        //Step3: Tạo mệnh lệnh chạy SQL
        Statement stm = conn.createStatement();

        //step4: Execute SQL.
        stm.execute("SELECT * FROM Employees");
        ResultSet rs = stm.getResultSet();

        while (rs.next()) {
            int employeeID = rs.getInt(1);
            String firstName = rs.getString("first_name");

            String lastName = rs.getString(3);
            String email = rs.getString(4);
            String phone = rs.getString(5);
            java.sql.Date hireDate = rs.getDate(6);

            Employee employee = new Employee();
            employee.setEmployeeId(employeeID);
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setEmail(email);
            employee.setPhoneNumber(phone);
            employee.setHireDate(new java.util.Date(hireDate.getTime()));
            employees.add(employee);
        }
        return employees;
    }
}
