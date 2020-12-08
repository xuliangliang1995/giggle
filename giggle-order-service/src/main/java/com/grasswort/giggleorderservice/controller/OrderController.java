package com.grasswort.giggleorderservice.controller;

import com.grasswort.giggleorderservice.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuliang
 * @Date 2020/12/8
 * @Description
 */
@RestController
@RequestMapping("order")
public class OrderController {

    public final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public String orderPaySuccess() {
        orderService.orderPaySuccess();
        return "SUCCESS";
    }
}
