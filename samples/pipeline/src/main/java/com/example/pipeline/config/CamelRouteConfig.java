package com.example.pipeline.config;

import com.example.pipeline.processors.*;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRouteConfig extends RouteBuilder {

    @Override
    public void configure() {

        Processor validationProcessor = new ValidationProcessor();
        Processor fraudCheckProcessor = new FraudCheckProcessor();
        Processor authorizationProcessor = new AuthorizationProcessor();
        Processor persistenceProcessor = new PersistenceProcessor();
        Processor notificationProcessor = new NotificationProcessor();

        from("direct:payment")
                .process(validationProcessor)
                .process(fraudCheckProcessor)
                .process(authorizationProcessor)
                .process(persistenceProcessor)
                .process(notificationProcessor)
                .log("Pagamento finalizado: ${body}");
    }
}
