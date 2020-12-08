package com.grasswort.gigglepayservice.dao;

import com.grasswort.gigglepayservice.model.PayResult;
import org.springframework.stereotype.Repository;

@Repository
public interface PayResultDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PayResult record);

    int insertSelective(PayResult record);

    PayResult selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayResult record);

    int updateByPrimaryKey(PayResult record);
}