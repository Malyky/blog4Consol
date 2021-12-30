package com.example.cameldemo.route;

import com.example.cameldemo.entity.Conzert;
import com.example.cameldemo.processor.KonzertValidator;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {

    @Autowired
    private KonzertValidator validator;

    @Override
    public void configure() throws Exception {
        from("file:inbox?noop=true")
                .log("${body}")
                .unmarshal().jacksonxml(Conzert.class)
                .process(validator)
                .setProperty("city", simple("${body.city}"))
                .marshal().json(JsonLibrary.Jackson, true)
                .to("file:outbox?fileName=${exchangeProperty.city}.json");
    }
}
