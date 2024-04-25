package com.example.springback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@Slf4j
public class TestController {
    private final LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
    private static int count = 0;

    @Value("${test.var}")
    private String var;

    @GetMapping
    public String getMapping() {
        log.info("호출횟수!!={} localDateTime={}", count++, localDateTime.toString());
        return "호출횟수 " + count + " var = " + var +  " -- " + localDateTime.toString() ;
    }
}
