/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session8;

import java.sql.Connection;

public class CallableStatement {

	public static void main(String[] args) {
        try (Connection conn = JDBCUtils.getConnection()){

            //1. tạo store procedure

            //3 create statement
            //String sql = "EXEC dbo.usp_Employee_findById ?";
            String sql = "{call dbo.usp_Employee_findById(?)}";
            CallableStatement statement = conn.prepareCall(sql);
            statement.setInt(1, 101);

            statement.executeQuery();
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                System.out.println(id);

                String firstName = resultSet.getString(2);
                System.out.println(firstName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void callFunction() {

        try (Connection conn = JDBCUtils.getConnection()){

            //1. tạo store procedure

            //3 create statement
            String sql = "select SUBSTRING(?, ?, ?)";
            CallableStatement statement = conn.prepareCall(sql);
            statement.setString(1, "huypn");
            statement.setInt(2, 1);
            statement.setInt(3, 2);

            statement.executeQuery();
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                String output = resultSet.getString(1);
                System.out.println(output);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
