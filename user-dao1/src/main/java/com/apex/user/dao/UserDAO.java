package com.apex.user.dao;

import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;

//import com.apex.user.entity.HibernateUtil;
import com.apex.user.entity.User;
import com.apex.user.util.HibernateUtil;

public class UserDAO {
	public void addUser(User user) throws Exception, SystemException {
		
	Session session=HibernateUtil .getSessionFactory().openSession();
		Transaction tx=null;
		try {
		tx=(Transaction) session.beginTransaction();
		session.save(user);
		tx.commit();
		
		} 
		catch (Exception e) {
			tx.rollback();
		
		}
			}
		
	
	public User getUser(int userId) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		User user= (User)session.load(User.class, new Integer(userId));
		return user;
	}
	
	
	
	
	public void updateUser(User user) throws Exception, Exception {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		try {
		tx=(Transaction) session.beginTransaction();
		//User user =getUser( userId);
		session.delete(user);
		tx.commit();
		
		} catch (Exception e) {
			tx.rollback();
		
		}
		
	}
	public void deleteUser(int userId) throws Exception, SystemException {
		//Session session = com.apex.user.util.HibernateUtil.getSessionFactory().openSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx=null;
		try {
		tx=(Transaction) session.beginTransaction();
		User user =getUser( userId);
		session.delete(userId);
		tx.commit();
		
		} catch (Exception e) {
			tx.rollback();
		
		}
		
	}
}
