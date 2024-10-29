package ma.emsi.eureka.client2;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class service2Controller {

    @GetMapping("/date")
    public String getCurrentDate() {
        return "Current Date: " + LocalDate.now();
    }
}
