package com.example.cameldemo.processor;

import com.example.cameldemo.entity.Conzert;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class KonzertValidator implements Processor {


    @Override
    public void process(Exchange exchange) throws Exception {
        Conzert conzert = exchange.getIn().getBody(Conzert.class);

        // do more complex validations here
        conzert.setValidated(true);

    }
}
