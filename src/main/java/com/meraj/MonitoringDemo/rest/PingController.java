package com.meraj.MonitoringDemo.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
@Slf4j
public class PingController {

    @GetMapping()
    public ResponseEntity<String> ping(){
        log.warn("dummywarning");
        return ResponseEntity.ok("pong");
    }
}
