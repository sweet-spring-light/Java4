package com.dao;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import com.buoi3.entity.User;
import com.untils.HibernateUtils;

public class UserDAO {
	private Session hSession;
	public UserDAO() {
		hSession = HibernateUtils.getSession();
	}
	
	public User store(User entity)
	{
		this.hSession.beginTransaction();
		Integer id = (Integer) this.hSession.save(entity);
		this.hSession.getTransaction().commit();
		
		entity.setId(id);
		
		return entity;
	}
	
	public List<User> paginate(int offset, int limit)
	{
		String hql = "From User";
		Query query = this.hSession.createQuery(hql);
		query.setFirstResult(offset);
		query.setMaxResults(limit);
		
		List<User> listUser =query.getResultList();
		return listUser;
		
	}
	
	public User findById(int id) {
		User entity = this.hSession.get(User.class, id);
		return entity;
	}
	public void update(User entity)
	{
		try {
			this.hSession.clear();
			this.hSession.beginTransaction();
			this.hSession.update(entity);
			this.hSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();

			this.hSession.getTransaction().rollback();
		}
	}
	public void delete(User entity) {
    	this.hSession.clear();
    	try {
			this.hSession.beginTransaction();
			
			this.hSession.delete(entity);
			
			this.hSession.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
			this.hSession.getTransaction().rollback();
			
			throw e;
		}
    }
	public List<User> getAllUser() {
		Session session = HibernateUtils.getSession();
		List<User> listUser = new ArrayList<User>();
		
		try {
			String hql = "FROM User";
			Query query = session.createQuery(hql, User.class);
			listUser = query.getResultList();

			return listUser;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public User login(String email, String password)
	{
		String hql = "SELECT entity FROM User entity " 
				+   "WHERE entity.email = :email AND entity.password = :password " 
				+ "AND entity.status = 1";
		Query query = this.hSession.createQuery(hql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		try {
			User entity = (User) query.getSingleResult();
			
			return entity;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
}

