package com.gmail.vasylvovkastr;

import java.util.Date;

/**
 * Created by vasyl on 6/29/15.
 */
public class Prodact implements Comparable<Prodact>{
    String name;
    String producer;
    Date produceDate;
    int goodTermin;
    int priceItem;
    int count;
    int volume;
    String Kategory;

    public Prodact(String name, String producer,
                   Date produceDate, int goodTermin, int priceItem,
                   int count, int volume, String Kategory) {
        this.name = name;
        this.producer = producer;
        this.produceDate = produceDate;
        this.goodTermin = goodTermin;
        this.priceItem = priceItem;
        this.count = count;
        this.volume = volume;
        this.Kategory = Kategory;
    }

    @Override
    public String toString() {
        return "Name:\t" + this.name + "\nProducer:\t" + this.producer +
                "\nProduce Date:\t" + this.produceDate +
                "\nGood Termin Date:\t" + this.goodTermin +
                "\nPrice Item:\t" + this.priceItem +
                "\nCount:\t" + this.count +
                "\nVolume:\t" + this.volume +
                "\nKategory:\t" + this.Kategory+"\n+---\n";
    }



    @Override
    public int compareTo(Prodact t) {
        int res = 0;
        boolean flag = !this.name.equals(t.name)||
                !this.producer.equals(t.producer)||
                t.priceItem!=this.priceItem;
        if (flag) res = this.hashCode();
        return res;
    }


}
