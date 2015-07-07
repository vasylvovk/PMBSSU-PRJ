package com.gmail.vasylvovkastr.userinterface;

import com.gmail.vasylvovkastr.supportobjects.Kategory;

import javax.swing.*;
import java.awt.*;

public class GuestInterface extends JFrame {

    public GuestInterface(){
        this.setSize(1000, 500);
        this.setTitle("Guest Mode");

        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("Alcohol");
        listModel.addElement("Grossery");

        JList list = new JList(listModel);
        list.setBounds(10,10,440,490);
        this.add(list);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public boolean loginUser() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void searchKategories() {
    }

    public void searchProducts() {
    }


    public static void main(String... args) {
        JFrame guestForm = new GuestInterface();
        guestForm.setVisible(true);
    }
}
