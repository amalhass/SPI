package fr.univbrest.dosi.spi.entites;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String userName;
	private String pwd;
	private final List<String> roles;

	public User() {
		super();
		roles = new ArrayList<String>();
	}

	public User(String userName, String pwd) {
		super();
		this.roles=new ArrayList<String>();
		this.userName = userName;
		this.pwd = pwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public List<String> getRoles() {
		return roles;
	}

	
}
