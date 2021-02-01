package com.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

   @Value("${message: default value}")
   private String message;

    @GetMapping("/message")
    public ResponseEntity<String> message() {
        return ResponseEntity.ok(message);
    }
}
