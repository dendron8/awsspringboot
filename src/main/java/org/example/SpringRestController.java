package org.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})

@RestController
public class SpringRestController {

    @GetMapping("/connect")
    public String connect() {
        System.out.println("connected to spring boot");
        return "connected!!!!!";
    }
}
