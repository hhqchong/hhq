package com.chong.Dao;

import javax.annotation.Resource;

import org.hibernate.*;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.chong.entity.User;
@Repository
public class UserDaoImp implements UserDao {
 
	@Resource
	private SessionFactory  sessionFactory;
	
	public void save(User user) {
		// TODO Auto-generated method stub
		System.out.print("hello!\n");
		 Session s=sessionFactory.openSession();
		 System.out.print("hello 1!\n");
		   Transaction tx=null;
	       try{
	    	   tx=s.beginTransaction();
	    	   s.save(user);
	    	   tx.commit();
	       }
	       catch(HibernateException e){
	    	   if(tx!=null){
	    		   tx.rollback();
	    	   }
	    	   throw e;
	       }
	       finally{
	    
			   s.close();
	       }
	
		     System.out.print("save seccess!\n");
		}

}
