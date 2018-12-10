package es.apinazo.cloudsample.greetings;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * An example of using the {@link DiscoveryClient} and
 * demoing the app is registered in the discovery server.
 */
@RestController
@RequestMapping("discovery")
public class DiscoveryClientController {

    @Value("${spring.application.name}")
    private String appName;

    // This could be replace by EurekaClient if a deeper insight is needed.
    private DiscoveryClient discoveryClient;

    // DiscoveryClient is injected here.
    // Also there is no need to use @Autowired as long there is no empty constructor.
    public DiscoveryClientController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @RequestMapping("/services")
    public String services() {
        // Get the lists of the IDs from all services registered in the discovery server.
        return discoveryClient.getServices().toString();
    }

}
