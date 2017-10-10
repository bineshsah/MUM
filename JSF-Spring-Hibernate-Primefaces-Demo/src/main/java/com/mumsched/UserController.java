/**
 * 
 */
package com.mumsched;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.model.User;
import com.service.UserService;

/**
 * @author bkg
 *
 */

@ManagedBean
@SessionScoped
public class UserController implements Serializable{
	
	@ManagedProperty(value="#{userService}")
	UserService userService;
	
	private String name;
	private String surname;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void persistUser(){
		System.out.println("Saving Data ");
		User user = new User();
		user.setName(getName());
		user.setSurname(getSurname());
		userService.persistUser(user);
	}
	
}
