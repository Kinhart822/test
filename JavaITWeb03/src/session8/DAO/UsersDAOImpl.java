/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session8.DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import session8.JDBCUtils;
import session8.PreparedStatement;
import session8.Users;

public class UsersDAOImpl implements UsersDao {

    public static void main(String[] args) {
        UsersDAOImpl usersDAO = new UsersDAOImpl();
        Users users = usersDAO.checkLoginPreparedStatement();
        System.out.printf("User id %d - username %s and password %s", users.getId(), users.getUsername(), users.getPassword());
    }

    @Override
    public Users checkLoginStatement() {
        Users users = null;
        try (Connection conn = JDBCUtils.getConnection()){

            //3. statemetn
            String userInput = "admin'--'";
            String passwordInput = "123";

            String sql = "SELECT * FROM users WHERE username = '" + userInput +"' AND password = '"+ passwordInput +"'";
            Statement stm = conn.createStatement();


            ResultSet rs = ((java.sql.Statement) stm).executeQuery(sql);
            while (rs.next()) {
                users = new Users();
                users.setId(rs.getInt(1));
                users.setUsername(rs.getString(2));
                users.setPassword(rs.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public Users checkLoginPreparedStatement() {
        Users users = null;
        try (Connection conn = JDBCUtils.getConnection()){

            //3. statemetn
            String userInput = "admin'--";
            String passwordInput = "123";

            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, userInput);
            stm.setString(2, passwordInput);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                users = new Users();
                users.setId(rs.getInt(1));
                users.setUsername(rs.getString(2));
                users.setPassword(rs.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
}

