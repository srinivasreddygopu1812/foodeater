package com.foodeater.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dbutil.DbUtil;
import com.foodeater.pojos.UserPojo;

public class UserControllerDao {
	SessionFactory sf ;
	public void register(UserPojo up) {
		System.out.println("entered into register()!!UserControllerDao   ");

		 sf = DbUtil.getSessionFactory();
		Session sn = sf.openSession();
		sn.save(up);
		sn.beginTransaction().commit();
		sn.close();
		
		
	}

}
