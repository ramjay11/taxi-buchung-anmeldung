package com.ramjava.auto.buchung.fahrer.config;

import com.ramjava.auto.buchung.fahrer.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(AppConstant.SCHNELLSTART_EREIGNISSES)
                .build();

    }
}
