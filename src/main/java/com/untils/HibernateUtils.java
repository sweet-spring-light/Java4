package com.untils;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory;
	private static Session session;
//
	public static SessionFactory getSessionFactory()
	{
		if ((factory == null) || (!factory.isOpen())){
			//khoi tao lai
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			factory = config.buildSessionFactory();
			System.out.println("config is success");
		}
		return factory;
	}
	public static Session getSession() {
		if((session == null) || (!session.isOpen())){
			session = getSessionFactory().openSession();
			System.out.println("open session is success");
		}
		return session;
	}
}
