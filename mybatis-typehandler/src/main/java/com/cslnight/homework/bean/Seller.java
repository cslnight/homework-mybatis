package com.cslnight.homework.bean;

import java.util.List;

/**
 * @program: mybatis
 * @description: Seller
 * @author: chenshouliang
 * @create: 2020-05-08 16:48
 */
public class Seller {
    private int id;
    private String name;
    private List<Integer> products;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getProducts() {
        return products;
    }

    public void setProducts(List<Integer> products) {
        this.products = products;
    }
}
