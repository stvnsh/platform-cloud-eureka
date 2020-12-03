package cn.com.wcy.wtooleureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WtoolEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WtoolEurekaApplication.class, args);
    }

}
