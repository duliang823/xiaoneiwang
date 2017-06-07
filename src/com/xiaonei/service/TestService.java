package com.xiaonei.service;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

@Transactional    //打开事务管理
public class TestService {
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//返回国家列表
	public List showCountry(){
		return sessionFactory.getCurrentSession().createQuery("from Province").list();
	}
}


