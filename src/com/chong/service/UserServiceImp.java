package com.chong.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chong.Dao.UserDao;
import com.chong.entity.User;
@Service

public class UserServiceImp implements UserService {
    @Resource
	private UserDao userdao;
    
    @Transactional
	public void save(User user) {
		// TODO Auto-generated method stub
         userdao.save(user);
	}
    
    
}
