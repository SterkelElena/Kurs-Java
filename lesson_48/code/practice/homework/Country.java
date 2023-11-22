package practice.homework;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Country {
    private String name;
    private double population;
    private String continent;

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public double getPopulation() {
        return population;
    }

    public String getContinent() {
        return continent;
    }
}


