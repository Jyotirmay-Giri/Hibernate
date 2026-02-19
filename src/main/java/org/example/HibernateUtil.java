package org.example;
import org.hibernate.Session;
//import com.mysql.cj.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
//    private static org.hibernate.SessionFactory sessionFactory;
private static SessionFactory sessionFactory;

    static {
        try{
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(UserClassHibernate.class)
                    .buildSessionFactory();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static Session getSession() {
        return (Session) sessionFactory.getCurrentSession();
    }
}
