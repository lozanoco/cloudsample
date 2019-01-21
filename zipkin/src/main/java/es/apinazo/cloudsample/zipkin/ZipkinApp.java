package es.apinazo.cloudsample.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * Zipkin app.
 *
 * {@link EnableZipkinServer} collects distributed tracing from
 * all the services that import the starter-zipkin.
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipkinApp {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApp.class, args);
    }

}
