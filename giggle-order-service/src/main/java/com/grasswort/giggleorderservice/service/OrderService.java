package com.grasswort.giggleorderservice.service;

import com.grasswort.giggleorderservice.dao.OrderResultDao;
import com.grasswort.giggleorderservice.model.OrderResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xuliang
 * @Date 2020/12/8
 * @Description
 */
@Service
public class OrderService {

    private final OrderResultDao orderResultDao;

    public OrderService(OrderResultDao orderResultDao) {
        this.orderResultDao = orderResultDao;
    }


    // @Transactional(rollbackFor = Exception.class)
    public void orderPaySuccess() {
        OrderResult order = new OrderResult();
        order.setResult("PAY_SUCCESS");
        orderResultDao.insert(order);
    }
}
