package org.hibernate;
import org.hibernate.dto.UserDetails;

import org.hibernate.cfg.Configuration;
import org.hibernate.dto.Address;
import org.hibernate.dto.UserDetails;
import java.util.Date;

public class HibernateTest {
    public static void main(String[] args) {
        final UserDetails user = new UserDetails();
        user.setUserName("First User");

        Address addr1 = new Address();
        addr1.setStreet("First Street");
        addr1.setCity("First City");
        addr1.setState("First State");
        addr1.setPincode("100001");

        Address addr2 = new Address();
        addr2.setStreet("Second Street");
        addr2.setCity("Second City");
        addr2.setState("Second State");
        addr2.setPincode("200002");

        user.getListOfAddresses().add(addr1);
        user.getListOfAddresses().add(addr2);

        //UserDetails user2 = new UserDetails();
        //user.setUserName("Second User");
//        Address addr = new Address();
//        addr.setStreet("Street Name");
//        addr.setCity("City Name");
//        user.setHomeAddress(addr);
//        Address addr2 = new Address();
//        addr2.setStreet("Second Street Name");
//        addr2.setCity("Second City Name");
//        user.setOfficeAddress(addr2);
        //user2.setAddress();
//        user.setAddress("First User's Address");
//        user.setJoinedDate(new Date());
//        user.setDescription("Description");
        final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        final Session session = sessionFactory.openSession();
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
