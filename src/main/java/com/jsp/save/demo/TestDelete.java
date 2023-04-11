package com.jsp.save.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gayatri");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		//find by id
		 Pen p1=entityManager.find(Pen.class,1);
		 
		 
		 entityTransaction.begin();
		 entityManager.remove(p1);
		 entityTransaction.commit();
		 System.out.println(p1.getPname());
	}

}
