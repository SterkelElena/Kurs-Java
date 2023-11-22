package practice.homework;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryAppl {
    public static void main(String[] args) {
        List<Country> countries = new LinkedList<>();

// Добавляем страны в список
        countries.add(new Country("Germany", 84.40, "Europe"));
        countries.add(new Country("China", 1430.70, "Asia"));
        countries.add(new Country("Brazil", 216.29, "South America"));
        countries.add(new Country("Australia", 26.40, "Australia"));
        countries.add(new Country("Egypt", 113.26, "Africa"));
        countries.add(new Country("Canada", 38.80, "North America"));
        countries.add(new Country("India", 1430.62, "Asia"));
        countries.add(new Country("Mexico", 128.19, "North America"));
        countries.add(new Country("Russia", 146.45, "Europe & Asia"));
        countries.add(new Country("South Africa", 60.40, "Africa"));
        countries.add(new Country("Argentina", 45.80, "South America"));


// Сортировка по алфавиту
        Collections.sort(countries, Comparator.comparing(Country::getName));

        System.out.println("Список стран, отсортированный по алфавиту:");
        for (Country country : countries) {
            System.out.println(country.getName());
        }

// Сортировка по размеру населения в стандартном порядке
        Collections.sort(countries, Comparator.comparing(Country::getPopulation));

        System.out.println("Список стран, отсортированный по размеру населения (стандартный порядок):");
        for (Country country : countries) {
            System.out.println(country.getName() + " - " + country.getPopulation() + " mln.");
        }

// Сортировка по размеру населения в обратном порядке
        Collections.sort(countries, Comparator.comparing(Country::getPopulation).reversed());

        System.out.println("Список стран, отсортированный по размеру населения (обратный порядок):");
        for (Country country : countries) {
            System.out.println(country.getName() + " - " + country.getPopulation() + " mln.");
        }

// Сортировка по принадлежности континенту и размеру населения (от большего к меньшему)
        Collections.sort(countries, Comparator.comparing(Country::getContinent).thenComparing(Country::getPopulation).reversed());

        System.out.println("Список стран, отсортированный по континенту и размеру населения(обратный порядок):");
        for (Country country : countries) {
            System.out.println(country.getContinent() + " - " + country.getPopulation() + " mln.");
        }
    }
}
