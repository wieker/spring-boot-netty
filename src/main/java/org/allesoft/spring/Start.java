package org.allesoft.spring;

import org.kgusarov.integration.spring.netty.annotations.NettyController;
import org.kgusarov.integration.spring.netty.annotations.NettyOnConnect;
import org.kgusarov.integration.spring.netty.configuration.EnableNettyServers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NettyController
@EnableNettyServers
public class Start {
    @NettyOnConnect(serverName = "home", priority = 1)
    private void connect() {
        System.out.println("Hello, world!");
    }


    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }
}
