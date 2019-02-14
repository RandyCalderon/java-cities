package com.lambdaschool.cities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class CitiesMessage implements Serializable {
    private final String text;
    private final int priority;
    private final boolean secret;

    public CitiesMessage(@JsonProperty("Text")String text, @JsonProperty("priority")int priority,@JsonProperty("Secret") boolean secret) {
        this.text = text;
        this.priority = priority;
        this.secret = secret;
    }
}
