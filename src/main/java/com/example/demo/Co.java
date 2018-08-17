package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * is created by aMIN on 8/17/2018 at 5:00 AM
 */
@RestController
public class Co {

    @GetMapping("/f")
    public String g(){
        return "index";
    }

}
