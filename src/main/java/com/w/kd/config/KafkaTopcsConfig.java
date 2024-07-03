package com.w.kd.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopcsConfig {

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name("topic1")
                .partitions(1)
                .build();
    }

    @Bean
    public NewTopic topicQuickstartEvents() {
        return TopicBuilder.name("quickstart-events")
                .partitions(1)
                .build();
    }
}
