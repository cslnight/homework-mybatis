package com.cslnight.homework.mapper;

import com.cslnight.homework.bean.Seller;

public interface SellerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Seller record);

    int insertSelective(Seller record);

    Seller selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);
}