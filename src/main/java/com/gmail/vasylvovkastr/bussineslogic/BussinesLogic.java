package com.gmail.vasylvovkastr.bussineslogic;

import com.gmail.vasylvovkastr.dataaccessobject.HibernateUtil;
import com.gmail.vasylvovkastr.supportobjects.User;
import java.awt.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BussinesLogic {

    public void checkOrder() {
    }

    public void calcOrderBill() {
    }

    public void getProducts() {
    }

    public void getKategory() {
    }

    public void checkUser() {
    }

    private static List userList() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        List users = (List) session.createQuery("from User").list();
        session.close();
        return users;
    }

    private static User readUser(Long id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        User user = (User) session.get(User.class, id);
        session.close();
        return user;
    }

    private static User saveUser(User user) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        int id = (int) session.save(user);
        user.setIdUser(id);

        session.getTransaction().commit();

        session.close();

        return user;
    }

    private static User updateUser(User user) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        session.merge(user);

        session.getTransaction().commit();

        session.close();
        return user;

    }

    private static void deleteUser(User user) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        session.delete(user);

        session.getTransaction().commit();

        session.close();
    }

}
