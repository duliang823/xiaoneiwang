package com.xiaonei.base.service;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.xiaonei.base.service.BaseServiceInter;

@Transactional
public abstract class BaseServiceImpl implements BaseServiceInter {
	

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * @author ˳ƽ
	 * @param hql:�ڴ���hql�����Դ�?
	 * @param parameters:�ʺŶ�Ӧ�Ĳ�������
	 * */
	public List getResult(String hql, Object[] parameters) {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null && parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		
		return query.list();
	}

	public void save(Object obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

	public void delete(Object obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(obj);
	}

	public void update(Object obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(obj);
	}
	
	public Object findById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().load(clazz, id);
	}
	
}
