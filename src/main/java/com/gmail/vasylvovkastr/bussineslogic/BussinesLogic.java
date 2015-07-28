package com.gmail.vasylvovkastr.bussineslogic;

import com.gmail.vasylvovkastr.dataaccessobject.HibernateUtil;
import com.gmail.vasylvovkastr.dataaccessobject.UserDAO;
import com.gmail.vasylvovkastr.supportobjects.User;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BussinesLogic {

    public BussinesLogic() {

    }

    public void checkOrder() {
    }

    public void calcOrderBill() {
    }

    public void getProducts() {
    }

    public void getKategory() {
    }

    public boolean checkUserName(String name) {
        boolean isUser = false;
        List users = (List) this.userList();
        for (Iterator it = users.iterator(); it.hasNext();) {
            User item = (User) it.next();
            if (item.getUserName().equals(name)) {
                isUser = true;
                break;
            }
        }
        return isUser;
    }

    public boolean checkUserLogin(String login) {
        boolean isLogin = false;
        List users = (List) this.userList();
        for (Iterator it = users.iterator(); it.hasNext();) {
            User item = (User) it.next();
            if (item.getUserName().equals(login)) {
                isLogin = false;
                break;
            }
        }
        return isLogin;
    }

    public static List userList() {
        System.out.println("start userList");

        List users = UserDAO.userList();

        System.out.println("stop userList");

        return users;
    }

    public static User readUser(int id) {
        User user = UserDAO.readUser(id);
        return user;
    }

    public static void saveUser(User user) {
        System.out.println("start saveUser");

        UserDAO.saveUser(user);

        System.out.println("stop saveUser");
        //return user;
    }

    public static User updateUser(User user) {
        User usr = UserDAO.updateUser(user);
        return usr;
    }

    public static void deleteUser(User user) {
        UserDAO.deleteUser(user);
    }

    public boolean checkProductName(String name) {
        boolean isUser = false;
        List users = (List) this.userList();
        for (Iterator it = users.iterator(); it.hasNext();) {
            User item = (User) it.next();
            if (item.getUserName().equals(name)) {
                isUser = true;
                break;
            }
        }
        return isUser;
    }

    public boolean checkProducerName(String login) {
        boolean isLogin = false;
        List users = (List) this.userList();
        for (Iterator it = users.iterator(); it.hasNext();) {
            User item = (User) it.next();
            if (item.getUserName().equals(login)) {
                isLogin = false;
                break;
            }
        }
        return isLogin;
    }

    public static List productList() {
        System.out.println("start productList");

        List users = UserDAO.userList();

        System.out.println("stop productList");

        return users;
    }

    public static User readProduct(int id) {
        User user = UserDAO.readUser(id);
        return user;
    }

    public static void saveProduct(User user) {
        System.out.println("start saveUser");

        UserDAO.saveUser(user);

        System.out.println("stop saveUser");
        //return user;
    }

    public static User updateProduct(User user) {
        User usr = UserDAO.updateUser(user);
        return usr;
    }

    public static void deleteProduct(User user) {
        UserDAO.deleteUser(user);
    }
}
