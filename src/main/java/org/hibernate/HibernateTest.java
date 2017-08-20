package org.hibernate;
import org.hibernate.dto.UserDetails;

import org.hibernate.cfg.Configuration;
import org.hibernate.dto.Address;
import org.hibernate.dto.UserDetails;
import java.util.Date;

public class HibernateTest {
    public static void main(String[] args) {
        //final
        UserDetails user = new UserDetails();
        user.setUserName("First User");

        //UserDetails user2 = new UserDetails();
        //user.setUserName("Second User");

        Address addr = new Address();
        addr.setStreet("Street Name");
        addr.setCity("City Name");
        user.setAddress(addr);
        //user2.setAddress();
//        user.setAddress("First User's Address");
//        user.setJoinedDate(new Date());
//        user.setDescription("Description");
        //final
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        //final
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        //session.save(user2);
        session.getTransaction().commit();
        session.close();
//        user = null;
//        //final
//        session = sessionFactory.openSession();
//        session.beginTransaction();
//        user = (UserDetails) session.get(UserDetails.class, 1);
//        System.out.println("User name retrieved is " + user.getUserName());
    }
}
