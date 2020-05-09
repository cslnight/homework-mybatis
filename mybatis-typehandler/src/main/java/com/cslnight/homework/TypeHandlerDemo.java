package com.cslnight.homework;

import com.cslnight.homework.bean.Seller;
import com.cslnight.homework.mapper.SellerMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Arrays;

/**
 * @program: mybatis
 * @description: TypeHandlerDemo
 * @author: chenshouliang
 * @create: 2020-05-08 17:42
 */
public class TypeHandlerDemo {

    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = MySqlSessionFactory.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Seller seller = new Seller();
        seller.setId(1);
        seller.setName("testa");
        seller.setProducts(Arrays.asList(new Integer[]{1,3}));
        sqlSession.insert("insertSeller", seller);
        sqlSession.commit();

        Seller seller1 = sqlSession.selectOne("selectSeller",1);
        System.out.println(seller1.getProducts());
    }
}
