package com.hibernate.vintudhibernate;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSystem {
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("Vintud");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//addUser("firstName", "lastName", "pseudo", "password", "mail.com","2222220002", "adressxd", 1);
		LocalDate today = LocalDate.now();
		//addannouncement("title","description",1,1.4,"photo",Date.valueOf(today),true,1,"charguia", 1);
         //System.out.println( getaddannouncementByid(47));
		/*for(int i=0; i<getallannouncement().size()-1;i++) {

		System.out.println(getallannouncement().get(i));
		
		}*/
		//announcementUpdate(47 , "hoooooooo ",100 , "haaaaaaaa");
		announcementDelete(47);


	}
	  public static void addUser(String firstName, String lastName, String pseudo, String password, String mail,String phone, String adress, int roleId) {
	        // The EntityManager class allows operations such as create, read, update, delete
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        // Used to issue transactions on the EntityManager
	        EntityTransaction et = null;
	 
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	            // Create and set values for new customer
	            UserImpl cust = new UserImpl(firstName, lastName,  pseudo, password, mail,phone, adress, roleId);
	         
	 
	            // Save the customer object
	            em.persist(cust);
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	    }
	  
	  
	  
	  
	  
	  public static void addannouncement(String title,String description,long categorie,double price,String photo,Date publication_Date,boolean disponibility_State,int viewNumber,String localisation, int user_id) {
	        // The EntityManager class allows operations such as create, read, update, delete
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        // Used to issue transactions on the EntityManager
	        EntityTransaction et = null;
	 
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	            // Create and set values for new customer
	            AnnouncementImpl An = new AnnouncementImpl( title,description,categorie, price, photo,publication_Date, disponibility_State,viewNumber, localisation,  user_id);
	         
	 
	            // Save the customer object
	            em.persist(An);
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	    }
	  
	  
	  public static AnnouncementImpl getaddannouncementByid(int id) {
	        // The EntityManager class allows operations such as create, read, update, delete
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        // Used to issue transactions on the EntityManager
	        EntityTransaction et = null;
	        AnnouncementImpl An =new  AnnouncementImpl();
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	             An = em.find(AnnouncementImpl.class,id);
	           
	 
	            // Save the customer object
	           
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	        return An;
	    }
	  
	  
	  public static List <AnnouncementImpl> getallannouncement() {
	        // The EntityManager class allows operations such as create, read, update, delete
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        // Used to issue transactions on the EntityManager
	        EntityTransaction et = null;
	        List <AnnouncementImpl> annonces=new ArrayList<AnnouncementImpl>();	       
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	            annonces=em.createQuery("from AnnouncementImpl ",AnnouncementImpl.class).getResultList();
	           
	 
	            // Save the customer object
	           
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	        return annonces;
	    }
	  
	  
	  public static void announcementUpdate(int id , String title,double price , String description) {
	        // The EntityManager class allows operations such as create, read, update, delete
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        // Used to issue transactions on the EntityManager
	        EntityTransaction et = null;
	 
	        try {
	            
	            et = em.getTransaction();
	            et.begin();
	 
	            // Create and set values for new customer
	            AnnouncementImpl An = em.find(AnnouncementImpl.class, id);
	            An.setTitle(title);
	            An.setPrice(price);
	            An.setDescription(description);
	            em.persist(An);
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	    }
	  
	  
	  public static void announcementDelete(int id ) {
	        // The EntityManager class allows operations such as create, read, update, delete
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        // Used to issue transactions on the EntityManager
	        EntityTransaction et = null;
	 
	        try {
	            
	            et = em.getTransaction();
	            et.begin();
	 
	            // Create and set values for new customer
	            AnnouncementImpl An = em.find(AnnouncementImpl.class, id);
	        
	            em.remove(An);
	            et.commit();
	            System.out.println("annonces supprimer avec succes");
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	  }
	    

}
