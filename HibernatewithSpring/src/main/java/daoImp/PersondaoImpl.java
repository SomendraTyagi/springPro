package daoImp;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Person.PersonDetails;
import daoInter.PersondaoInter;

@Component
public class PersondaoImpl implements PersondaoInter {

private SessionFactory sessionfactory ;

public SessionFactory getsessionfactory()
{
	return sessionfactory;
}
@Autowired
public void setSessionFactory(SessionFactory sessionFactory) {
this.sessionfactory = sessionFactory;
}

public void insert(PersonDetails person) {
Session session = getsessionfactory().openSession();
session.beginTransaction();
session.save(person);
session.getTransaction().commit();
 session.close();
}

/*public void listEmployees( ){
    Session session = getsessionfactory().getCurrentSession();
    org.hibernate.Transaction tx = null;
    try{
       tx = session.beginTransaction();
       List employees = session.createQuery("FROM PersonDetails").list(); 
       for (Iterator iterator = 
                         employees.iterator(); iterator.hasNext();){
    	   PersonDetails   persondetails = (PersonDetails) iterator.next(); 
          System.out.print("First Name: " + persondetails.getName()); 
          System.out.print(" Rollno : " + persondetails.getRollno()); 
           
       }
       tx.commit();
    }catch (HibernateException e) {
       if (tx!=null) tx.rollback();
       e.printStackTrace(); 
    }finally {
       session.close(); 
    }
 }*/
	
	
}
