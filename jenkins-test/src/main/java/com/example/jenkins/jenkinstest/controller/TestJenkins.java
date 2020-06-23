package com.example.jenkins.jenkinstest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzf
 */
@RestController
@RequestMapping("jenkins")
@CrossOrigin
public class TestJenkins {

    @GetMapping("hello")
    public String helloJenkins() {
        return "hello Jenkins";
    }

}
