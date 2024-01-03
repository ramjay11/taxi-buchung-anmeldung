package com.ramjava.auto.buchung.fahrer.service;

import com.ramjava.auto.buchung.fahrer.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    // Store data to cluster
    public boolean updateLocation(String location) {
        kafkaTemplate.send(AppConstant.SCHNELLSTART_EREIGNISSES, location);
        return true;
    }
}
