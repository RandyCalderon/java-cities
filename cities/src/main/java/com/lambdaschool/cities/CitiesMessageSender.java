package com.lambdaschool.cities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@Slf4j
public class CitiesMessageSender {
    private final RabbitTemplate rt;
    private final CitiesRepository citiesrepos;

    public CitiesMessageSender(RabbitTemplate rt, CitiesRepository citiesrepos) {
        this.rt = rt;
        this.citiesrepos = citiesrepos;
    }

    public void sendMessage() {

    }
}
