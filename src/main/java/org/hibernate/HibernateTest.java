package org.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.dto.UserDetails;

import java.util.Date;

public class HibernateTest {

    public static void main(String[] args) {
        final UserDetails user = new UserDetails();
        user.setUserId(1);
        user.setUserName("First User");
        user.setAddress("First User's Address");
        user.setJoinedDate(new Date());
        user.setDescription("Description");

        final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        final Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

}
