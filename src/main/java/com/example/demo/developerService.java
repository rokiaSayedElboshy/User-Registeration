package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class developerService {
	 
	@Autowired
	developerRepository developerRepository;

	public void addUser(User newUser){
		
		 developerRepository.save(newUser);
		
	}

}
