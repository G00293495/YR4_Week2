package ie.atu.week2.week2_refresher;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Week2Refresher {

    @GetMapping("/hello")
    public String message()
    {
        return "Hello";

    }
}
