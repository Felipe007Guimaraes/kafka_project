package com.br.felipe.guimaraes.kafka.consumer.listener;

import com.br.felipe.guimaraes.kafka.consumer.dto.Message;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
    private final ObjectMapper mapper;

    public KafkaConsumer(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @KafkaListener(
            topics = "${topic.kafka-consumer}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consumer(String message) throws IOException {
        logger.info(String.format("#### -> Consuming message -> %s", message));
        try {
            if(message == null){
                logger.info("Ignoring empty message!");
                return;
            }
            final Message messageDto = mapper.readValue(
                    message,
                    Message.class
            );

            logger.info(String.format("Consumed message"));

        }catch (Exception e){
            throw new RuntimeException("Error consuming message"
                    +e.getCause()+" - "
                    +e.getMessage()
            );
        }
    }
}
