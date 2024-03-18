package com.kafka.handson.kafka;

import com.kafka.handson.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaConsumer.class);
@KafkaListener(topics="javaguides_json",groupId="myGroup")
    public void consume(User user){
    LOGGER.info(String.format("Json message received ->%s",user.toString()));

    }


}
