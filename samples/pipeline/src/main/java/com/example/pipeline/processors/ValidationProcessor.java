package com.example.pipeline.processors;

import com.example.pipeline.model.PaymentRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.spi.annotations.Component;

import java.math.BigDecimal;

@Component("validationProcessor")
public class ValidationProcessor implements Processor {

    @Override
    public void process(Exchange exchange) {

        PaymentRequest payment =
                exchange.getIn().getBody(PaymentRequest.class);

        if (payment.getValor().compareTo(BigDecimal.ZERO) <= 0) {
            throw new RuntimeException("Valor inválido");
        }

    }
}
