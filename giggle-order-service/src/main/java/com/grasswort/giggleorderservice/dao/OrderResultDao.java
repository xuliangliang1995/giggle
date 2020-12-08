package com.grasswort.giggleorderservice.dao;

import com.grasswort.giggleorderservice.model.OrderResult;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderResultDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderResult record);

    int insertSelective(OrderResult record);

    OrderResult selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderResult record);

    int updateByPrimaryKey(OrderResult record);
}