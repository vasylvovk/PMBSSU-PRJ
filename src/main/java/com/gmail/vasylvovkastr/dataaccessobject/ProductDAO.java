/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.vasylvovkastr.dataaccessobject;

import com.gmail.vasylvovkastr.supportobjects.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author vasyl
 */
public class ProductDAO {

    public ProductDAO() {
    }

    public static List productList() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        List users;
        users = (List) session.createQuery("from User").list();
        session.close();

        return users;
    }

    public static User readProduct(int id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        User user = (User) session.get(User.class, id);
        session.close();
        return user;
    }

    public static void saveProduct(User user) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        int id = (int) session.save(user);
        user.setIdUser(id);

        session.getTransaction().commit();

        session.close();
        //return user;
    }

    public static User updateProduct(User user) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        session.merge(user);

        session.getTransaction().commit();

        session.close();
        return user;

    }

    public static void deleteProduct(User user) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        session.delete(user);

        session.getTransaction().commit();

        session.close();
    }
}
