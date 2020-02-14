package com.apex.user.client;
import com.apex.user.entity.*;
import com.apex.user.dao.*;




public class UserClient {
	
	public static void main(String[] args) {
	UserDAO userDAO=new UserDAO();
	User user=userDAO.getUser(1);
	System.out.println(user.getFirstName()); 
		
	}

}
