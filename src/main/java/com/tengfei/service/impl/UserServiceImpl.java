package com.tengfei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tengfei.dao.UserDao;
import com.tengfei.entity.User;
import com.tengfei.service.UserService;

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

	@Override
	public User getByUserName(String userName) {
		return userDao.getByUserName(userName);
	}

	@Override
	public List<User> findAllUser() {
		return userDao.findAllUser();
	}  
    
    
  
}  