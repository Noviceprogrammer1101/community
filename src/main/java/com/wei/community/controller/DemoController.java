package com.wei.community.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wei
 */

@RestController
public class DemoController {

    @RequestMapping("/demo")
    public String hello() {
        return "hello";
    }
}
