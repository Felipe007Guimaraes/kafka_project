package com.br.felipe.guimaraes.kafka.consumer.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    @JsonProperty("id")
    public String id;

    @JsonProperty("message")
    public String message;

    public Message() {
    }

    @JsonCreator
    public Message(
            @JsonProperty("id") String id,
            @JsonProperty("message") String message
    ) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}