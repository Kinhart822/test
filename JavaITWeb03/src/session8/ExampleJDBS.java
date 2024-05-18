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

public class ExampleJDBS {

	    protected Connection connection;
	    public ExampleJDBS() {
	        try {
	            String user = "sa";
	            String pass = "123456";
	            String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=SMS";
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            connection = DriverManager.getConnection(url, user, pass);
	        } catch (SQLException | ClassNotFoundException ex) {
	            ex.printStackTrace();
	        }
	    }
}

