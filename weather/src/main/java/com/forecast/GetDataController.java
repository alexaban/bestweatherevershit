package com.forecast;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetDataController {

    @RequestMapping("/getData")
    public String getGreet() {
        return "Hello from hell";
    }
    
    /*her setter vi opp en connection til WEATHER API og henter ut info om været*/
}
