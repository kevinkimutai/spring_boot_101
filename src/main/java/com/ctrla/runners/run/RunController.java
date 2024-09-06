package com.ctrla.runners.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunController {

    @GetMapping("/hello")
    public String hello() {
        return "Waatu?,mnajuaje niaje?";
    }
}
