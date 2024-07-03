package com.w.kd.controller;

import com.w.kd.config.producer.MessageProducer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class KafkaSendMessageController {

    private final MessageProducer messageProducer;

    @GetMapping("send-message")
    public String sendMessage(@RequestParam("topic") String topic, @RequestParam("message") String message) {
        return messageProducer.send(topic, message);
    }
}
