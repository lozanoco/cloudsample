package es.apinazo.cloudsample.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * This is the gateway service in cloudsample.
 *
 * @{@link EnableZuulProxy} enables routing and mapping of URL to the cloud services.
 */
@EnableZuulProxy
@SpringBootApplication
public class GatewayApp {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApp.class, args);
    }

}
