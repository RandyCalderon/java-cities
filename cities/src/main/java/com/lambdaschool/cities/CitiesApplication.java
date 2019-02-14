package com.lambdaschool.cities;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CitiesApplication {

    public static final String EXCHANGE_NAME = "LambdaServer";
    public static final String SECRET_QUEUE = "Secret";
    public static final String QUEUE_CITIES_ONE = "Cities One";
    public static final String QUEUE_CITIES_TWO = "Cities Two";

    public static void main(String[] args) {
        SpringApplication.run(CitiesApplication.class, args);
    }

    @Bean
    public TopicExchange appExchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    public Queue appQueueCitiesOne() {
        return new Queue(QUEUE_CITIES_ONE);
    }

    @Bean
    public Binding declareBindingCitiesOne() {
        return BindingBuilder.bind(appQueueCitiesOne()).to(appExchange()).with(QUEUE_CITIES_ONE);
    }

    @Bean
    public Queue appQueueCitiesTwo() {
        return new Queue(QUEUE_CITIES_TWO);
    }

    @Bean
    public Binding declareBindingCitiesTwo() {
        return BindingBuilder.bind(appQueueCitiesTwo()).to(appExchange()).with(QUEUE_CITIES_TWO);
    }

    @Bean
    public Queue appQueueSecret() {
        return new Queue(SECRET_QUEUE);
    }

    @Bean
    public Binding declareBindingSecret() {
        return BindingBuilder.bind(appQueueSecret()).to(appExchange()).with(SECRET_QUEUE);
    }

    @Bean
    public Jackson2JsonMessageConverter producerJackson2MessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}

