package com.gmail.vasylvovkastr.dataaccessobject;

import com.gmail.vasylvovkastr.supportobjects.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDAO {

    public UserDAO() {
    }
    
    
    public static List userList() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        List users;
        users = (List) session.createQuery("from User").list();
        session.close();
        
        return users;
    }
    
    public static User readUser(int id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        User user = (User) session.get(User.class, id);
        session.close();
        return user;
    }

    public static void saveUser(User user) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();

        int id = (int) session.save(user);
        user.setIdUser(id);

        session.getTransaction().commit();

        session.close();
        //return user;
    }

    public static User updateUser(User user) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        session.merge(user);

        session.getTransaction().commit();

        session.close();
        return user;

    }

    public static void deleteUser(User user) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        session.delete(user);

        session.getTransaction().commit();

        session.close();
    }
}
