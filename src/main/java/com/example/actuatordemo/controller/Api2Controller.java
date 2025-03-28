package com.example.actuatordemo.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api2Controller {

    @PostMapping("/api2")
    public ResponseEntity<String> receiveRequest(@RequestHeader("reg-channel-version") String customHeader) {
        // Process the header
        System.out.println("Header reg-channel-version is : " + customHeader);
        return ResponseEntity.ok("Received header: " + customHeader);
    }
}
