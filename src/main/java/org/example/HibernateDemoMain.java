package org.example;

import com.mysql.cj.Session;

public class HibernateDemoMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();

        try{
            UserClassHibernate user = new UserClassHibernate(1L,"Jyoti");
            session.beginTransaction();
            session.persist(user);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
