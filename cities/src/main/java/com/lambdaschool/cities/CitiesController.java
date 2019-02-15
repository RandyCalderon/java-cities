package com.lambdaschool.cities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Slf4j
@RestController
@RequestMapping("/cities")
public class CitiesController {
    private final CitiesRepository citiesrepos;
    private final RabbitTemplate rt;

    public CitiesController(CitiesRepository citiesrepos, RabbitTemplate rt) {
        this.citiesrepos = citiesrepos;
        this.rt = rt;
    }

    @GetMapping("/afford")
    public void findSome() {
        ArrayList<City> cities = new ArrayList<>();
        cities.addAll(citiesrepos.findAll());

        for(City c: cities) {

        }
    }
}
