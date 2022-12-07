package task5;

import java.util.List;

interface Filter {

    boolean isSuitablePerson(String firstName, String lastName);

    default Person get(List<Person> personList) {

        Person result = personList.get(0);

        for (Person person:
             personList) {

            if(!isSuitablePerson(person.getFirstName(), person.getLastName()))
                continue;

            if(person.getAge() > result.getAge())
                result = person;

        }

        return result;

    }

}

public class Person{

    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
