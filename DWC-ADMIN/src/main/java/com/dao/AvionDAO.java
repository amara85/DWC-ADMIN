package com.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Avion;

public class AvionDAO implements IAvionDAO {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addAvion(Avion avion) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().save(avion);
	}

	public void updateAvion(Avion avion) {
		// TODO Auto-generated method stub
		Session hibernateSession = sessionFactory.openSession();
		Transaction tx = hibernateSession.beginTransaction(); 
		hibernateSession.update(avion);
		tx.commit(); 
		hibernateSession.close();
	}

	public void deleteAvion(Avion avion) {
		Session hibernateSession = sessionFactory.openSession();
		Transaction tx = hibernateSession.beginTransaction(); 
		hibernateSession.delete(avion);
		tx.commit(); 
		hibernateSession.close();
	}


	public Avion getAvionByMatricule(String matricule) {
		// TODO Auto-generated method stub
	      @SuppressWarnings("unchecked")
		List<Avion> list = getSessionFactory().getCurrentSession()
                  .createQuery("from Avion where imm=?")
                  .setParameter(0, matricule).list();
	      if(list.size()>0)
	     	return list.get(0);
	      else
	    	return null;
	}
	
	public List<Avion> getAvions() {
		// TODO Auto-generated method stub
        @SuppressWarnings("unchecked")
		List<Avion> list = getSessionFactory().getCurrentSession().createQuery("from Avion").list();
        return list;
	}

	@Override
	public List<Avion> getAvionsSearch(String mat_search, String airl_search) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Avion> list = getSessionFactory().getCurrentSession()
				.createQuery("from Avion where imm=:mat_search and nowner=:airl_search")
				.setParameter("mat_search", mat_search)
				.setParameter("airl_search", airl_search)
				.list();
		
        return list;
	}

	@Override
	public List<Avion> getAvionsSearchMat(String mat_search) {
		// TODO Auto-generated method stub
		System.out.println("selem22");
		@SuppressWarnings("unchecked")
		List<Avion> list = getSessionFactory().getCurrentSession()
				.createQuery("from Avion where imm=:mat_search")
				.setParameter("mat_search", mat_search)
				.list();
		
        return list;
	}

	@Override
	public List<Avion> getAvionsSearchAirl(String airl_search) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Avion> list = getSessionFactory().getCurrentSession()
				.createQuery("from Avion where nowner=:airl_search")
				.setParameter("airl_search", airl_search)
				.list();
		
        return list;
	}

	
	}
