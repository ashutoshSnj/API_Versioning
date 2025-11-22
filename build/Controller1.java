package com.build;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/{version}/student")
public class Controller1 {

    @GetMapping
    public String getV1() {
        return "Student API V1";
    }
}
