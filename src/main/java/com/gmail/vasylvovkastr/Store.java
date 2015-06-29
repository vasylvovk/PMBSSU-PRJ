package com.gmail.vasylvovkastr;

import java.util.TreeSet;

/**
 * Created by vasyl on 6/29/15.
 */
public class Store {
    int square;
    String storeName;
    String adress;
    String MOL;
    static TreeSet<Prodact> goods = new TreeSet<>();

    public Store(int square, String storeName, String adress, String MOL) {
        this.square = square;
        this.storeName = storeName;
        this.adress = adress;
        this.MOL = MOL;
    }


    public String getMOL() {
        return MOL;
    }

    public boolean setMOL(String MOL) {
        this.MOL = MOL;
        return true;
    }

    public boolean addNewProdact(Prodact prodact){
        return goods.add(prodact);
    }

    @Override
    public String toString() {
        String res = "";
        for (Prodact item: goods)
            res = res + item.toString();
        return res;
    }
}