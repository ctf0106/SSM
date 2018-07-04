package com.ctf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ctf.dao.UserDao;
import com.ctf.entity.User;
import com.ctf.service.UserService;

@Service("userService")  
public class UserServiceImpl implements UserService {
	
    @Resource  
    private UserDao userDao;

	@Override
	public List<User> getUserList(String userName) {
		return userDao.getUserList(userName);
	}

	@Override
	public User selectUserByID(int id) {
		return userDao.selectUserByID(id);
	}

	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public int deleteUserInfo(int id) {
		return userDao.deleteUserInfo(id);
	}  
    
    
  
}  