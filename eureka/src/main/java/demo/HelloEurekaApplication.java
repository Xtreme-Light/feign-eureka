package demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Copyright @ 2019 慧享科技 Co. Ltd.
 * All right reserved.
 *
 * @author 徐亮
 * createDate: 2021-01-18
 */
@SpringBootApplication
@EnableEurekaServer
public class HelloEurekaApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloEurekaApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
