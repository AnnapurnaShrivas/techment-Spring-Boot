package com.techment.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dto.UserDto;
import com.techment.entity.User;
import com.techment.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserRepository iUserRepository;

	@Override
	public UserDto login(String username, String password) throws NoSuchElementException{

		System.out.println("USERNAME = "+username);
				System.out.println("PASSWORD = "+password);
			
		
		User user = iUserRepository.findByUsernameAndPassword(username, password).get();
		System.out.println(user.getUsername()+ " USERNAME "+user.getPassword()+" PASSWORD");
		System.out.println(user.toString());
		

		UserDto userDto = new UserDto(user.getUsername(),user.getPassword(),"mytoken1");
		
		return userDto;
	}

	
	
}
