package es.apinazo.cloudsample.polyglot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * Example application of Spring Cloud Netflix Sidecar.
 *
 * This app listens to a Node.js application located in the 'nodeapp' directory
 * and registers it in the discovery server and so it will available through Zuul
 * and could retrieve properties from the config server.
 *
 * Thus all the endpoints from the Node.js app will be available through the
 * Zuul gateway.
 */
@EnableSidecar
@SpringBootApplication
public class PolyglotService {

    public static void main(String[] args) {
        SpringApplication.run(PolyglotService.class);
    }

}
