package com.chong.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.Configuration;

import com.chong.Dao.UserDao;
import com.chong.Dao.UserDaoImp;
import com.chong.entity.User;
public class UserDaoImpTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		UserDao u=new UserDaoImp();
		User user=new User();
		user.setUsername("hah");
		user.setPassword("123");
		u.save(user);
	}

}
