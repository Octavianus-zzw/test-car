package com.zzwmservicetest.testcar;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableApolloConfig
public class TestCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCarApplication.class, args);
    }

}
