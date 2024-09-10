package com.br.felipe.guimaraes.kafka.producer.service.converter;

import com.br.felipe.guimaraes.kafka.producer.dto.Message;
import com.br.felipe.guimaraes.kafka.producer.dto.MessageAvro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ConvertMessage {

    private static final Logger logger = LoggerFactory.getLogger(ConvertMessage.class);
    private static final String CONVERT_ERROR = "error converting message - ";
    private static final String STARTING = "Starting to convert AVRO messages";
    private static final String SUCCESSFULLY = "Avro construction successfully carried out";

    public String buildAvroMessage(Message messageString) {

        MessageAvro messageAvro;

        logger.info(STARTING);

        try {
            messageAvro = MessageAvro.newBuilder()
                    .setId(messageString.getId())
                    .setMessage(messageString.getMessage())
                    .build();

            logger.info(SUCCESSFULLY);

            return messageAvro.toString();

        } catch (Exception e) {

            throw new RuntimeException(
                    CONVERT_ERROR
                    +e.getMessage());
        }
    }
}