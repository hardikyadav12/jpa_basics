package com.hardik.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("cu");
    	EntityManager em = emf.createEntityManager();
    	
    	Customer c = em.find(Customer.class, 1);
    	System.out.println(c.toString());
    	
    	Customer cus = new Customer();
    	cus.setId(4);
    	cus.setName("Aditi");
    	cus.setEmail("aditi@gmail.com");
    	cus.setAddress("PKL IND");
    
    	em.getTransaction().begin();
    	em.persist(cus);
    	em.getTransaction().commit();
    	
    }
}
