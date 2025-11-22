package com.build;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/{version}/student")   // URL versioning
public class CombineController {

    // ----------- HEADER-BASED VERSIONING (v1.0) -------------
    @GetMapping(value = "", version = "1.0")
    public StudentDto1 getV1() {
        return new StudentDto1("Ashutosh", "Pune Maharashtra");
    }

    // ----------- HEADER-BASED VERSIONING (v1.1) -------------
    @GetMapping(value = "/account/{id}", version = "1.1")
    public String accountV11(@PathVariable int id) {
        return "Account V1.1, ID = " + id;
    }

    // ----------- HEADER-BASED VERSIONING (v2.0) -------------
    @PostMapping(value = "", version = "2.0")
    public StudentDto2 postV2() {
        return new StudentDto2("Ashutosh Sanjay Shelke", 11);
    }


    // ========== URL VERSIONING (Only PATH, no version attribute here) ===========
    @GetMapping("/path-mode")
    public String pathMode() {
        return "URL Path Versioning Working!";
    }
}
