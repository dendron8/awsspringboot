package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})

@RestController
public class SpringRestController {

    private static final Logger log = LoggerFactory.getLogger(SpringRestController.class);

    private final ObservableUserService ouService;

    SpringRestController(ObservableUserService ouService) {
        this.ouService = ouService;
    }

    @GetMapping("/user/{userId}")
    String userName(@PathVariable("userId") String userId) {
        log.info("Got a request");
        return ouService.userName(userId);
    }

    @GetMapping("/connect")
    public String connect() {
        log.info("got in connect");
        System.out.println("connected to spring boot!");
        return "";
    }
}
