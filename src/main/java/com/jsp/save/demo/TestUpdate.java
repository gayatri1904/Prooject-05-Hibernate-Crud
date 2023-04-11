package com.jsp.save.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gayatri");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Pen p=entityManager.find(Pen.class,2);
		p.setPname("gelpen");
		p.setColor("lightblue");
		
		 entityTransaction.begin();
		 entityManager.merge(p);
		 entityTransaction.commit();
	}

}
