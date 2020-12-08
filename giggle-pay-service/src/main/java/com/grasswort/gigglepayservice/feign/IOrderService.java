package com.grasswort.gigglepayservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xuliang
 * @Date 2020/12/8
 * @Description
 */
@FeignClient(name = "giggle-order-service")
public interface IOrderService {

    @GetMapping("order")
    String orderPaySuccess();
}
