package es.apinazo.cloudsample.polyglot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@EnableSidecar
@SpringBootApplication
public class PolyglotService {

    public static void main(String[] args) {
        SpringApplication.run(PolyglotService.class);
    }

}
