package org.cadc.mgt.persistence;

import java.util.List;

import org.cadc.mgt.domain.User;

public interface UserMapper {

	/**
	 * @return all the users
	 */
	public List<User> getAllUsers();
	/**
	 * @param user
	 * @return the number of rows affected
	 */
	public int insertUser(User user);
	/**
	 * @param user
	 * @return the number of rows affected
	 */
	public int updateUser(User user);
}
