package com.dbutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbUtil {
	static SessionFactory sf=null;
	
	public static SessionFactory getSessionFactory() {
		if(sf==null) {
			System.out.println("2nd  time request");
		return	sf=new Configuration().configure().buildSessionFactory();
		}
		else {
			return sf;
		}
		
		 
		
	}

}
