package org.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.dto.UserDetails;

public class HibernateTest {

    public static void main(String[] args) {
        final UserDetails user = new UserDetails();
        user.setUserId(1);
        user.setUserName("First User");

        final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        final Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

}
