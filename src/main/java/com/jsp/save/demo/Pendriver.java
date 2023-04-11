package com.jsp.save.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Pendriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gayatri");
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		 
		 
		 Pen pen=new Pen();
		 pen.setPid(6);
		 pen.setPname("inky");
		 pen.setColor("blue");
		 pen.setPrice(100);
		 
		 
		entityTransaction.begin();
		entityManager.persist(pen);
		entityTransaction.commit();
	}

}
