package org.cadc.mgt.service;

import java.util.List;

import org.cadc.mgt.domain.User;
import org.cadc.mgt.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public List<User> getAllUsers() {
		return userMapper.getAllUsers();
	}

	public boolean saveUser(User user) {
		if (user.getId() == 0) {
			return userMapper.insertUser(user) == 1;
		} else {
			return userMapper.updateUser(user) == 1;
		}
	}
}
