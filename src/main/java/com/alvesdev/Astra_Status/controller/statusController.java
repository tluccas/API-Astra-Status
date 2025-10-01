package com.alvesdev.Astra_Status.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.Duration;
import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/astra")
public class statusController {

    private volatile LocalDateTime lastUpdate;
    @PostMapping("/up-status")
    public void isConnected() {
        lastUpdate = LocalDateTime.now();
        System.out.println(lastUpdate);
    }

    @GetMapping("/get-status")
    public String getStatus() {
        if(lastUpdate == null) {
            return "offline";
        }

        Duration duration = Duration.between(lastUpdate, LocalDateTime.now());

        if(duration.toMinutes() > 20) {
            return "offline";
        }
        return "online";
    }
}
