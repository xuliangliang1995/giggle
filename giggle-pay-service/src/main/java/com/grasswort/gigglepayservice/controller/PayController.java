package com.grasswort.gigglepayservice.controller;

import com.grasswort.gigglepayservice.service.PayResultService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuliang
 * @Date 2020/12/8
 * @Description
 */
@RestController
@RequestMapping("pay")
public class PayController {

    private final PayResultService payResultService;

    public PayController(PayResultService payResultService) {
        this.payResultService = payResultService;
    }

    @GetMapping
    public String payCallBack() {
        payResultService.payCallBack();
        return "SUCCESS";
    }
}
