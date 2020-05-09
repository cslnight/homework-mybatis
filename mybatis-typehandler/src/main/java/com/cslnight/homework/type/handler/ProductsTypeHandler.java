package com.cslnight.homework.type.handler;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: mybatis
 * @description: Products TypeHandler
 * @author: chenshouliang
 * @create: 2020-05-08 17:19
 */
public class ProductsTypeHandler extends BaseTypeHandler<List<Integer>> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<Integer> integers, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, StringUtils.join(integers,","));
    }

    @Override
    public List<Integer> getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String result = resultSet.getString(s);
        return convertResult(result);
    }

    @Override
    public List<Integer> getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String result = resultSet.getString(i);
        return convertResult(result);
    }

    @Override
    public List<Integer> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String result = callableStatement.getString(i);
        return convertResult(result);
    }

    private List<Integer> convertResult(String result) {
        List<String> products = Arrays.asList(result.split(","));
        List<Integer> results = new ArrayList<>();
        for (String product : products) {
            results.add(Integer.parseInt(product));
        }
        return results;
    }

}
