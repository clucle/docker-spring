package com.github.clucle.docker_spring_mysql.controller;

import com.github.clucle.docker_spring_mysql.utils.NaverUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/naver")
public class NaverController {

    @Autowired
    private NaverUtil naverUtil;

    @GetMapping
    public String home() {
        return naverUtil.test();
    }
}
