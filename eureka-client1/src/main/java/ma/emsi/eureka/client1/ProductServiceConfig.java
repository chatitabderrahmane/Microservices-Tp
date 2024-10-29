package ma.emsi.eureka.client1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductServiceConfig {

  
    @Value("${m}")
    private String inventoryServiceUrl;

    

    public String getInventoryServiceUrl() {
        return inventoryServiceUrl;
    }


}