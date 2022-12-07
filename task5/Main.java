package task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>(
                Arrays.asList(
                new Person("Alex", "Investor", 11),
                new Person("Danil", "Turbaba", 25),
                new Person("Vadym", "Kravchenko", 9),
                new Person("Vitaliy", "Tsal'", 40))
                );

        Filter filter = (String firstName, String lastName) -> (firstName + lastName).length() <= 15;

        System.out.println(filter.get(people).toString());

    }

}
