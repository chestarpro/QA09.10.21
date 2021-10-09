package org.example;

import org.example.entity.Address;
import org.example.entity.Customer;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class Application {
    public static void main(String[] args) {
    }
    public static <T> T saveEntity(T t) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        saveEntity(t);
        session.getTransaction().commit();
        session.close();
        return t;
    }
}
