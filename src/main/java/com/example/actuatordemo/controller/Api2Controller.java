package com.example.actuatordemo.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api2Controller {

    @PostMapping("/api2")
    public ResponseEntity<String> receiveRequest(@RequestHeader("Custom-Header") String customHeader) {
        // Process the header
        return ResponseEntity.ok("Received header: " + customHeader);
    }
}
