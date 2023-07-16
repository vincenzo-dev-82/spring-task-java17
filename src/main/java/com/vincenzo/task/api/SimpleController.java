package com.vincenzo.task.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/test")
public class SimpleController {

    @GetMapping("/simple")
    public String getSimple() {
        return "Simple";
    }
}
