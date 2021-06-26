package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.buoi3.entity.Favorites;
import com.buoi3.entity.User;
import com.untils.HibernateUtils;

public class FavariteDAO {
	private Session hSession;
	
	public FavariteDAO() {
		hSession = HibernateUtils.getSession();
	}
	
	public boolean store(Favorites entity)
	{
		
		try {
			this.hSession.beginTransaction();
			hSession.save(entity);
			this.hSession.getTransaction().commit();
			return true;
		} catch (Exception e) {
			hSession.getTransaction().rollback();
			e.printStackTrace();
			return false;
		}
	}
	
	public Favorites findById(int id) {
		Favorites entity = this.hSession.get(Favorites.class, id);
		return entity;
	}
	
	public boolean delete(Favorites entity) {
    	this.hSession.clear();
    	try {
			this.hSession.beginTransaction();
			this.hSession.delete(entity);
			this.hSession.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			this.hSession.getTransaction().rollback();
			return false;
		}
    }
	
	public Favorites checkDuplicateVideoByUser(int userID, int videoID) {
		Session session = HibernateUtils.getSession();
		String hql = "FROM Favorites as fv WHERE fv.userId = : userId AND videoId = :videoId";
		
		try {
			Query query = session.createQuery(hql);
			query.setParameter("userId", userID);
			query.setParameter("videoId", videoID);
			
			Favorites favorite = (Favorites) query.getSingleResult();
			
			return favorite;
		} catch (Exception e) {
			return null;
		}
	}
	
	public List<Favorites> getAllFavorites( int userId) {
		Session session = HibernateUtils.getSession();
		List<Favorites> listFavorites = new ArrayList<Favorites>();
		
		try {
			String hql = "FROM Favorites as fr WHERE fr.userId = :userId";
			
			Query query = session.createQuery(hql, Favorites.class);
			query.setParameter("userId", userId);
			listFavorites = query.getResultList();
			return listFavorites;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
