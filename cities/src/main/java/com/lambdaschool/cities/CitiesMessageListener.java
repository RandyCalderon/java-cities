package com.lambdaschool.cities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CitiesMessageListener {
    @RabbitListener(queues = CitiesApplication.QUEUE_CITIES_ONE)
    public void receiveMessage(CitiesMessage rm) {
        log.info("Received Message: {}", rm.toString());
    }
}
