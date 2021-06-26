package com.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.buoi3.entity.Post;
import com.buoi3.entity.User;
import com.untils.HibernateUtils;
public class VideoDAO {
	private Session hSession;
	public VideoDAO() {
		hSession = HibernateUtils.getSession();
	}
	
	public boolean store(Post entity)
	{
		Session session = HibernateUtils.getSession();
		Transaction ts = null; 
		try {
			ts = session.beginTransaction();
			session.save(entity);
			ts.commit();
			return true;
		} catch (Exception e) {
			ts.rollback();
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Post> getAllPost() {
		Session session = HibernateUtils.getSession();
		List<Post> listPost = new ArrayList<Post>();
		
		try {
			String hql = "FROM Post";
			Query query = session.createQuery(hql, Post.class);
			listPost = query.getResultList();

			return listPost;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Post> paginate()
	{
		
		String hql = "From Post";
		Query query = this.hSession.createQuery(hql);
		
		List<Post> listPost =query.getResultList();
		return listPost;
		
	}
	
	public Post findById(int id) {
		Post entity = this.hSession.get(Post.class, id);
		return entity;
	}
	public void update(Post entity)
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
	public void delete(Post entity) {
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
	
}
