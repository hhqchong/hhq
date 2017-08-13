package com.chong.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chong.entity.User;
import com.chong.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userservice;
	@RequestMapping(value="/login.do")
	public String sava(User user){
		userservice.save(user);
		return "user_add";
	}

}
