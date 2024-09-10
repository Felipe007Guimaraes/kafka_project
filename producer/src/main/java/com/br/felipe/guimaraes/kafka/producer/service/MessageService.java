package com.br.felipe.guimaraes.kafka.producer.service;

import com.br.felipe.guimaraes.kafka.producer.dto.Message;
import com.br.felipe.guimaraes.kafka.producer.service.converter.ConvertMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private static final Logger logger = LoggerFactory.getLogger(MessageService.class);
    @Value("${topic.kafka-producer}")
    private String topic;
    @Autowired
    private KafkaTemplate<Object, String> kafkaTemplate;
    @Autowired
    private ConvertMessage convertMessage;
    private final ObjectMapper objectMapper;

    public MessageService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public void sendMessage(String messageString) {
        logger.info("New message identified");

        try {
            final Message message =
                    objectMapper
                            .readValue(
                                    messageString,
                                    Message.class
                            );
            var newMessage =
                    convertMessage.buildAvroMessage(
                            message
                    );

            logger.info("Sending message -> {}", messageString);

            this.kafkaTemplate.send(
                    topic,
                    newMessage
            );

            logger.info("Message Sent successfully!");

        } catch (Exception e) {

            logger.error("Error sending the message");

            throw new RuntimeException(
                            e.getCause()+" - "
                            +e.getMessage()
            );
        }
    }
}