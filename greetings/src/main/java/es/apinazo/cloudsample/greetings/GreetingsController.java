package es.apinazo.cloudsample.greetings;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A demo of showing properties that come from a configuration file
 * served by the configuration server.
 */
@Slf4j
@RestController
@RequestMapping
public class GreetingsController {

    // Properties come from configurations in Cloud Config.

    @Value("${greetings.hello}")
    private String hello;

    @Value("${greetings.goodbye}")
    private String goodbye;

    @RequestMapping("/hello")
    public String sayHello() {
        log.info("Hello!");
        return hello;
    }

    @RequestMapping("/goodbye")
    public String sayGoodbye() {
        log.info("Goodbye!");
        return goodbye;
    }

}
