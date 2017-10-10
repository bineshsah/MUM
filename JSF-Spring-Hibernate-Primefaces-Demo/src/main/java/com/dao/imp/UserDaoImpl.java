/**
 * 
 */
package com.dao.imp;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.UserDao;
import com.model.User;

/**
 * @author bkg
 *
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void persistUser(User user) {
		sessionFactory.getCurrentSession().persist(user);
	}

	public User findUserById(int id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	public void updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
		
	}

	public void deleteUser(User user) {
		sessionFactory.getCurrentSession().delete(user);
		
	}

}