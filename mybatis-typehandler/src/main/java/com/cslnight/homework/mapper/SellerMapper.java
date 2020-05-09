package com.cslnight.homework.mapper;

import com.cslnight.homework.bean.Seller;

/**
 * @program: mybatis
 * @description: SellerMapper
 * @author: chenshouliang
 * @create: 2020-05-08 17:47
 */
public interface SellerMapper {

    Seller selectSeller(int id);

    void insertSeller(Seller seller);

    void updateSeller(Seller seller);

    void deleteSeller(int id);
}
