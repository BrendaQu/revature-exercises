package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HibernateUtil {
    public static void addEmployee(Employee employee){
        SessionFactory sessionFactory = EmployeeSessionFactory.sessionFactory();

        //get the connection
        Session session = sessionFactory.openSession();

        Transaction txn = session.beginTransaction();

        session.save(employee);
        txn.commit();
        session.close();
    }

    public static void updateEmployee(Employee employee){
        SessionFactory sessionFactory = EmployeeSessionFactory.sessionFactory();

        //get the connection
        Session session = sessionFactory.openSession();

        Transaction txn = session.beginTransaction();

        session.update(employee);
        txn.commit();
        session.close();
    }

    public static void deleteEmployee(Employee employee){
        SessionFactory sessionFactory = EmployeeSessionFactory.sessionFactory();
        Session session = sessionFactory.openSession();

        Transaction txn = session.beginTransaction();

        session.remove(employee);
        txn.commit();
        session.close();
    }

    public static List getAllEmployees(){
      //  List employeeList = new ArrayList();

        SessionFactory sessionFactory = EmployeeSessionFactory.sessionFactory();
        Session session = sessionFactory.openSession();
        Transaction txn = session.beginTransaction();

        List employeeList = session.createQuery("from Employee").getResultList();
        txn.commit();
        session.close();

        return employeeList;
    }
}
