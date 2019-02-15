package com.lambdaschool.cities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CitiesMessageListener {
    @RabbitListener(queues = CitiesApplication.SECRET_QUEUE)
    public void receiveSecretMessage(CitiesMessage rm) {
        log.info("Received Message: {}", rm.toString());
    }

    @RabbitListener(queues = CitiesApplication.QUEUE_CITIES_ONE)
    public void receiveCitiesOneMessage(CitiesMessage rm) {
        log.info("Received Message: {}", rm.toString());
    }

    @RabbitListener(queues = CitiesApplication.QUEUE_CITIES_TWO)
    public void receiveCitiesTwoMessage(CitiesMessage rm) {
        log.info("Received Message: {}", rm.toString());
    }
}
