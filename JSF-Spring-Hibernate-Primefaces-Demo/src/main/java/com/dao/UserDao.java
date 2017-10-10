/**
 * 
 */
package com.dao;

import com.model.User;

/**
 * @author bkg
 *
 */
public interface UserDao {

		void persistUser(User user);
		User findUserById(int id);
		void updateUser(User user);
		void deleteUser(User user);
	

}
