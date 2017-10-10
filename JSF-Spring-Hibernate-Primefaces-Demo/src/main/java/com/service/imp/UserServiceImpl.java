/**
 * 
 */
package com.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;

/**
 * @author bkg
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Transactional
	public void persistUser(User user) {
		userDao.persistUser(user);
		
	}
	@Transactional
	public User findUserById(int id) {
	
		return userDao.findUserById(id);
	}
	@Transactional
	public void updateUser(User user) {
		userDao.updateUser(user);
		
	}
	@Transactional
	public void deleteUser(User user) {
		userDao.deleteUser(user);
		
	}

}
