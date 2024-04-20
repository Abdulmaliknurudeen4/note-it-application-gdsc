package com.nexusforge.noteitapplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public ResponseEntity<Note> getNote(){
        Note sampleNote = new Note("RTC", "This keeps track of value time");
        return ResponseEntity.ok(sampleNote);
    }
}
