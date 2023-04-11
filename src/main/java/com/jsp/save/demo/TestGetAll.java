package com.jsp.save.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class TestGetAll {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gayatri");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	//EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	
	Pen p=new Pen ();
     String sql="select t from Pen t ";
     Query query=entityManager.createQuery(sql);
     
     
     List<Pen> pens= query.getResultList();
      
      
      for(Pen p1:pens) { 
    	  System.out.println(p1.getPid());
    	  System.out.println(p1.getPname());
    	  System.out.println(p1.getColor());
    	  System.out.println(p1.getPrice());
    	  
    	  
      }
	}

}
