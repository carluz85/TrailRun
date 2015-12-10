package org.cadc.mgt.service;

import java.util.List;

import org.cadc.mgt.domain.User;

/**
 * 
 * @author LanyonM
 */
public interface UserService {

	/**
	 * @return a list of all {@link User}s
	 */
	public List<User> getAllUsers();
	/**
	 * @param user
	 * @return success
	 */
	public boolean saveUser(User user);

}
