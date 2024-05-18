/*
*(C) Copyright 2021 Fresher Academy. All Rights Reserved.
*
* @author: Phạm Hoàng Anh
* @date: Dec 8, 2023
*/

package session8.DAO;

import session8.Users;

public interface UsersDao {
	Users checkLoginStatement();
    Users checkLoginPreparedStatement();
}
