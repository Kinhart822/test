/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
        
		//Step1: Tải JDBC của MS-SQL (Các class thực hiện) 
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	    //Step2: Connect to Database
	    String url = "jdbc:sqlserver://localhost:1433;databaseName=HR_DB;encrypt=true;trustServerCertificate=true";
	    String username = "sa";
	    String password = "123456";
	    Connection con = DriverManager.getConnection(url, username, password);
	    return con;
	}
}
