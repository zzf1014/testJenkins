package com.example.jenkins.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzf
 */
@RestController
@RequestMapping("jenkins")
public class TestJenkinsController {
    @GetMapping("hello")
    public String hello() {
        return "hello jenkins 修改Jenkins、再次远程发布JAR";
    }
}
