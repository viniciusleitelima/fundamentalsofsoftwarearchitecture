package com.example.pipeline.processors;

import com.example.pipeline.model.PaymentRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.spi.annotations.Component;

@Component("persistenceProcessor")
public class PersistenceProcessor implements Processor {

    @Override
    public void process(Exchange exchange) {

        PaymentRequest payment =
                exchange.getIn().getBody(PaymentRequest.class);

        System.out.println("Salvando pagamento no banco");

    }
}
