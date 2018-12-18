package com.foodeater.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.dbutil.DbUtil;
import com.foodeater.daos.UserControllerDao;
import com.foodeater.pojos.UserPojo;

public class UserService {
	@Autowired
	UserControllerDao udao;
	public  String register(UserPojo up,Model m) {
		System.out.println("entered into register()!! UserService  ");
		udao.register(up);
		 m.addAttribute("msg", "you have successfully registered");
		
		return "RegSuccess";
		
	}

}
