//package com.project.catrest.controller;
//
//import com.project.catrest.kafka.KafkaProducer;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequiredArgsConstructor
//public class KafkaController {
//
//    private final KafkaProducer kafkaProducer;
//
//    @PostMapping("kafka/send")
//    public String send(@RequestBody String message) {
//        kafkaProducer.sendMessage(message);
//        return "Sent: " + message;
//    }
//
//}
