package com.kafka.handson.controller;

import com.kafka.handson.kafka.JsonKafkaProducer;
import com.kafka.handson.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
    private JsonKafkaProducer  kafkaProducer;
    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.kafkaProducer = jsonKafkaProducer;
    }
    @PostMapping("/publish")
    public ResponseEntity<String>publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }


}
