package com.gmail.vasylvovkastr.supportobjects;

import java.util.ArrayList;

public class Order {

    private ArrayList<Product> Products;

    private int receipt;

    public Order() {
        this.Products = new ArrayList<>();
        this.receipt = 0;
    }

    public void setReceipt(int receipt) {
        this.receipt = receipt;
    }

    public int getReceipt() {
        return receipt;
    }

    public boolean addToOrder(Product item) {
        return  Products.add(item);
    }

    public boolean removeFromOrder(Product item) {
        return  Products.remove(item);
    }
}
