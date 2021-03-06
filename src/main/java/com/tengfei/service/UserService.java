package com.tengfei.service;

import java.util.List;

import com.tengfei.entity.User;

public interface UserService {
	public List<User> getUserList(String userName);
	
	public User selectUserByID(int id);
	
	public int insertUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUserInfo(int id);

	public User getByUserName(String userName);

	public List<User> findAllUser();
}
