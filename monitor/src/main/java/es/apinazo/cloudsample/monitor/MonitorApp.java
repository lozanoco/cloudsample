package es.apinazo.cloudsample.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is the monitor app.
 *
 * @{@link EnableAdminServer} enables metrics recollection from apps registered
 * in the discovery server and a web app where to watch them.
 */
@EnableAdminServer
@SpringBootApplication
public class MonitorApp {

    public static void main(String[] args) {
        SpringApplication.run(MonitorApp.class, args);
    }

}
