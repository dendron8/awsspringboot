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
        return "This page is the result of an application that was deployed with " +
                "the following flow:" +
                "1. code pushed to https://github.com/dendron8/awsspringboot" +
                "2. CodeBuild job aws-spring-boot triggered automatically, runs gradle build and a docker build/push to ECR via buildspec.yml file." +
                "3. an event via EventBridge is triggered and sent to an ECS cluster to deploy the new code.";
    }
}
