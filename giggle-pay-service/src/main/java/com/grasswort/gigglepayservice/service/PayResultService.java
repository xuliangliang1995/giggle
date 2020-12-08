package com.grasswort.gigglepayservice.service;

import com.grasswort.gigglepayservice.dao.PayResultDao;
import com.grasswort.gigglepayservice.feign.IOrderService;
import com.grasswort.gigglepayservice.model.PayResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xuliang
 * @Date 2020/12/8
 * @Description
 */
@Service
public class PayResultService {

    private final PayResultDao payResultDao;

    private final IOrderService orderService;

    public PayResultService(PayResultDao payResultDao, IOrderService orderService) {
        this.payResultDao = payResultDao;
        this.orderService = orderService;
    }

    @Transactional(rollbackFor = Exception.class)
    public void payCallBack() {
        PayResult payResult = new PayResult();
        payResult.setResult("PAY_SUCCESS");
        payResultDao.insert(payResult);
        orderService.orderPaySuccess();
    }
}
