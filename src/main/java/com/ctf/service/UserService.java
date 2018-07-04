package com.ctf.service;

import java.util.List;

import com.ctf.entity.User;

public interface UserService {
	public List<User> getUserList(String userName);
	
	public User selectUserByID(int id);
	
	public int insertUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUserInfo(int id);
}
