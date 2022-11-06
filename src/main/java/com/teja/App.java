package com.teja;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.teja.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// Creating Session from Session Factory
		Session session = factory.getCurrentSession();
		
		// Beginning Transaction From Session
		session.beginTransaction();
		
		Student student = session.get(Student.class,1);
		
		Query query = session.createNativeQuery("select * from student", Student.class);
		
		List<Student> list = query.getResultList();
		
		for(Student i:list) {
			System.out.println(i);
		}
	
		// Saving a Student Session
//		session.save(student);
		System.out.println(student);
		
		// Closing a Session
		session.close();
		
		
	}
    
    }
