package com.ramjava.auto.buchung.fahrer.controller;

import com.ramjava.auto.buchung.fahrer.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {
    @Autowired
    private CabLocationService service;

    // Publish the location of the driver
    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {
        // Update random locations
        //System.out.println(Math.random() + " , " + Math.random());
        service.updateLocation(Math.random() + ", " + Math.random());
        // Update every 1 second
        Thread.sleep(1000);
        int range = 100;
        while (range > 0) {
            range --;
        }
        return new ResponseEntity<>(Map.of("message", "Location Updated"), HttpStatus.OK);
    }
}
