package com.ramjava.autobuchungbenutzer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "schnellstart-ereignisses", groupId = "user-group")
    public void cabLocation(String location) {
        System.out.println(location);
    }
}
