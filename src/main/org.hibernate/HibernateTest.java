import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

    public static void main(String[] args) {
        UserDetails user = new UserDetails();
        user.setUserId(1);
        user.setUserName("First User");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = new sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();



    }


}
