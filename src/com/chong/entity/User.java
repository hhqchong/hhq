package com.chong.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="Users")
@Entity
public class User {
	    
  	   private Long id;
	  
    	private String username;
	  
	    private String password;
	    @Id
	    @Column(name="ID")
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	  	public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		  @Column(name="NAME")
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		  @Column(name="PSW")
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
