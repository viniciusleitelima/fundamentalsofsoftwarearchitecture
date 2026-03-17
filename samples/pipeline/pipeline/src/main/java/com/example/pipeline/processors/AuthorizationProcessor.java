package com.example.pipeline.processors;

import com.example.pipeline.model.PaymentRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class AuthorizationProcessor implements Processor {

    @Override
    public void process(Exchange exchange) {

        PaymentRequest payment =
                exchange.getIn().getBody(PaymentRequest.class);

        payment.setAutorizado(true);

    }
}