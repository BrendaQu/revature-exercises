package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeSessionFactory {
    public static SessionFactory sessionFactory() {
        SessionFactory sessionFactory = null;

        if (sessionFactory == null) {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }
}
