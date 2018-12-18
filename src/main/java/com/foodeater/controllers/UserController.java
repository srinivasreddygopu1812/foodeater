package com.foodeater.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.foodeater.pojos.UserPojo;
import com.foodeater.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService us;
	
	@RequestMapping(value="/reg",method=RequestMethod.POST)
	public String register(UserPojo up,Model m) {
		System.out.println("entered into register()!! UserController  ");
		
		return us.register(up,m); 
		
		
		
	}
	

}
