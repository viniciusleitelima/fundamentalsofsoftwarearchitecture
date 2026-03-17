package com.example.pipeline.controller;

import com.example.pipeline.model.PaymentRequest;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private ProducerTemplate producerTemplate;

    @PostMapping
    public PaymentRequest pagar(@RequestBody PaymentRequest payment) {

        return producerTemplate.requestBody(
                "direct:payment",
                payment,
                PaymentRequest.class
        );
    }
}
