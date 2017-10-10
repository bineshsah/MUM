/**
 * 
 */
package com.service;

import com.model.User;

/**
 * @author bkg
 *
 */

public interface UserService {
	void persistUser(User user);
	User findUserById(int id);
	void updateUser(User user);
	void deleteUser(User user);
}