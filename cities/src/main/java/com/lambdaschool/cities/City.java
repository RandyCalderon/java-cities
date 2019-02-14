package com.lambdaschool.cities;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Data
@Entity
public class City {
    private @Id @GeneratedValue Long id;
    private String name;
    private int medianHomePrice;
    private int affordabilityIndex;

    public City() {

    }

    public City(String name, int medianHomePrice, int affordabilityIndex) {
        this.name = name;
        this.medianHomePrice = medianHomePrice;
        this.affordabilityIndex = affordabilityIndex;
    }
}
