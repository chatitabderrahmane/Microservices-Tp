package ma.emsi.eureka.client1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class service1Controller {

   
    
    @GetMapping("/greeting")
    public	 String getGreeting() {
        return "Hello from Service A!";
    }
    private final ProductServiceConfig config;

    public service1Controller(ProductServiceConfig config) {
        this.config = config;
    }

    @GetMapping("/config")
    public String getConfig() {
        return "Database URL: " + config.getInventoryServiceUrl() ;
    }
}
