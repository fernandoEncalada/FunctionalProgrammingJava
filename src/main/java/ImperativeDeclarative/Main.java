package ImperativeDeclarative;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Fernando", Gender.MALE));
        people.add(new Person("Maria", Gender.FEMALE));
        people.add(new Person("Karina", Gender.FEMALE));
        people.add(new Person("Andrea", Gender.FEMALE));

        // Imperative approach / programming
        /* Type of programming using an approach with the sequence of statements,
        changing the program state and describing HOW TO DO something */
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person person : females) {
            System.out.println(person.toString());
        }

        // Declarative approach / programming
        /*
        A programming approach in which coders write code that describes what they WANT TO DO
        and what results they want to achieve, rather than how they will achieve the results
        * */
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
