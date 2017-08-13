package com.chong.service;

import org.springframework.transaction.annotation.Transactional;

import com.chong.entity.User;
public interface UserService {
	 public void save(User user);
	}
