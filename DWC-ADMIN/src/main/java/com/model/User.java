package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7751572660823042268L;
	
	@Id
    @Column(name="username", unique = true, nullable = false)
	private String  username;
	@Column(name="password", unique = false, nullable = false)
	private String  password;
	@Column(name="description", unique = false, nullable = false)
	private String  description;
	@Column(name="enabled", unique = false, nullable = false)
	private int  enabled;
	
	
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	
	  	
}
