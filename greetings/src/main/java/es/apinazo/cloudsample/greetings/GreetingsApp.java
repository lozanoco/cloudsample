package es.apinazo.cloudsample.greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A simple service of the cloudsample architecture. Used as a demo of
 * service discovery, centralized configuration and intented to be used
 * as a base from any further microservice in this cloud.
 */
// When the Eureka client is in the classpath, it's not necessary to use
// the @EnableEurekaClient annotation.
@SpringBootApplication
public class GreetingsApp {

    public static void main(String[] args) {
        SpringApplication.run(GreetingsApp.class);
    }
}
