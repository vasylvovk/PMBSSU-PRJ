package com.gmail.vasylvovkastr.supportobjects;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    
    @Id
    @GeneratedValue
    @Column(name = "pkey")
    private int idProduct;

    @Column(name = "name")
    private String productName;

    @Column(name = "producer")
    private String producerName;

    @Column(name = "start_date")
    private Date pduceDate;

    @Column(name = "srok_godnosti")
    private int expirationTewrin;

    @Column(name = "price")
    private int productPrice;

    @Column(name = "kategory")
    private Kategory kategory;

    public Product() {
    }

    public Product(int idProduct, String productName, String producerName, Date pduceDate, int expirationTewrin, int productPrice, Kategory kategory) {
        this.productName = productName;
        this.producerName = producerName;
        this.pduceDate = pduceDate;
        this.expirationTewrin = expirationTewrin;
        this.productPrice = productPrice;
        this.kategory = kategory;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public void setPduceDate(Date pduceDate) {
        this.pduceDate = pduceDate;
    }

    public void setExpirationTewrin(int expirationTewrin) {
        this.expirationTewrin = expirationTewrin;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setKategory(Kategory kategory) {
        this.kategory = kategory;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public String getProducerName() {
        return producerName;
    }

    public Date getPduceDate() {
        return pduceDate;
    }

    public int getExpirationTewrin() {
        return expirationTewrin;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public Kategory getKategory() {
        return kategory;
    }
}
