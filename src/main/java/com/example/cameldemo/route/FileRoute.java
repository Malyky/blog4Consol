package com.example.cameldemo.route;

import com.example.cameldemo.entity.Conzert;
import com.example.cameldemo.processor.ConzertValidator;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {

    @Autowired
    private ConzertValidator validator;

    @Override
    public void configure() throws Exception {
        from("file:inbox?noop=true")
                .log("Receiving file with Body: ${body}")
                .unmarshal().jacksonxml(Conzert.class)
                .process(validator)
                .setProperty("city", simple("${body.city}"))
                .marshal().json(JsonLibrary.Jackson, true)
                .log("Producing file")
                .to("file:outbox?fileName=${exchangeProperty.city}.json");
    }
}
