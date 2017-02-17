package fr.univbrest.dosi.spi.business;

import java.util.HashMap;
import java.util.Map;

import fr.univbrest.dosi.spi.entites.User;

public class UserService {

	private final Map<String, User> mapBouchonUser;
	
	public UserService(){
		this.mapBouchonUser=new HashMap<String,User>();
		this.mapBouchonUser.put("spiAdmin", new User("spiAdmin","spiAdmin"));
	}
	
	public User authentifier(final String login,final String pwd){
		final User user=this.mapBouchonUser.get(login);
		if(user != null && user.getPwd().equals(pwd)){
			return user;
		}
		return null;
	}
	
}
