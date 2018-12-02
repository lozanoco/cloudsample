package es.apinazo.cloudsample.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Centralized configuration server, implemented with Spring Cloud Config.
 *
 * @{@link EnableConfigServer} enables the server, serving the client configurations.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp.class);
    }
}
