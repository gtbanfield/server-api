package com.example.actuatordemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class ApiAController {

    @GetMapping("/data")
    public ResponseEntity<String> getData() {
        return ResponseEntity.ok("Hello I am the Data from Server - API 2!!");
    }

    @GetMapping(path = "test", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> headerDemo(@RequestHeader(name = "reg-channel-version") String header) {
        System.out.println("Header reg-channel-version is : " + header);
        String response = "Header reg-channel-version is : " + header;
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
