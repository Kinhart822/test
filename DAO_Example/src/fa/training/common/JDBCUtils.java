/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package fa.training.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
        
		//Step1: Tải JDBC của MS-SQL (Các class thực hiện) 
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	    //Step2: Connect to Database
	    String url = "jdbc:sqlserver://localhost:1433;databaseName=SMS;encrypt=true;trustServerCertificate=true";
	    String username = "sa";
	    String password = "kinhart822";
	    Connection conn = DriverManager.getConnection(url, username, password);
	    return conn;
	}
}
