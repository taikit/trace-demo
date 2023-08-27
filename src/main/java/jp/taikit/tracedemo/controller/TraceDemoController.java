package jp.taikit.tracedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraceDemoController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
