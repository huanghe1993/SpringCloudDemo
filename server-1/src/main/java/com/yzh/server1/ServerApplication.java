package com.yzh.server1;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import javax.net.ssl.SSLContext;

/**
 * @since 2021/11/5
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServerApplication {

    @Bean
    public DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs(SSLContext sslContext) {
        DiscoveryClient.DiscoveryClientOptionalArgs discoveryClientOptionalArgs = new DiscoveryClient.DiscoveryClientOptionalArgs();
        discoveryClientOptionalArgs.setSSLContext(sslContext);
        return discoveryClientOptionalArgs;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
