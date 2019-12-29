package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

     @PostMapping(value = "/payment/create")
    public CommonResult  create(@RequestBody Payment payment){
     paymentService.create(payment);
     return  new CommonResult(200,"payment create successful",payment);
    }



    @GetMapping(value = "/payment/get/{id}")
    public CommonResult  create(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        return  new CommonResult(200,"payment get successful",payment);
    }
}
