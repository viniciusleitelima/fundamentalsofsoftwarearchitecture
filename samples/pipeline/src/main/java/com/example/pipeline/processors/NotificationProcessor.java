package com.example.pipeline.processors;

import com.example.pipeline.model.PaymentRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.spi.annotations.Component;

@Component("notificationProcessor")
public class NotificationProcessor implements Processor {

    @Override
    public void process(Exchange exchange) {

        PaymentRequest payment =
                exchange.getIn().getBody(PaymentRequest.class);

        System.out.println("Enviando notificação de pagamento aprovado");

    }
}
