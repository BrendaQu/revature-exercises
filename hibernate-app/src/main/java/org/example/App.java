package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "project started...." );

        //create a configuration object
        Configuration cfg = new Configuration();

        //read the configuration and load in the object
        cfg.configure("hibernate.cfg.xml");

        //create factory
        SessionFactory factory = cfg.buildSessionFactory();

        // open the session
        Session session = factory.openSession();

        //begin the transaction
        Transaction t = session.beginTransaction();

        //create employee
  //      Employee employee = new Employee();
    //    employee.setId(1);
      //  employee.setName("Mark");
       // employee.setEmail("m@gmail.com");

        // save the employee
       // session.save(employee);

        // Employee employee =  session.get(Employee.class, 2);
     //   System.out.println(employee);
      /*  Query qry = session.createQuery("from Employee", Employee.class);

        List l =qry.list();
        System.out.println("Total Number Of Records : "+l.size());
        Iterator it = l.iterator();

        while(it.hasNext())
        {
            Object o = (Object)it.next();
            Employee e = (Employee) o;
            System.out.println("id : "+e.getId());
            System.out.println("Name : "+e.getName());
            System.out.println("Gender : "+e.getGender());
            System.out.println("----------------------");
        } */

        //commit the transaction
        t.commit();
        //close the connection
        session.close();


    }


}
