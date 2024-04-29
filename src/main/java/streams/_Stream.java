package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class _Stream {
    public static void main(String[] args) {

        List<_Stream.Person> people = new ArrayList<>();
        people.add(new _Stream.Person("Fernando", _Stream.Gender.MALE));
        people.add(new _Stream.Person("Maria", _Stream.Gender.FEMALE));
        people.add(new _Stream.Person("Karina", _Stream.Gender.FEMALE));
        people.add(new _Stream.Person("Andrea", _Stream.Gender.FEMALE));
        people.add(new _Stream.Person("Andrea", _Stream.Gender.PREFER_NOT_TO_SAY));

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> Gender.PREFER_NOT_TO_SAY.equals(person.gender);

        boolean containsOnlyFemales = people.stream()
                .noneMatch(personPredicate);

        System.out.println(containsOnlyFemales);
    }

    static class Person {
        private final String name;
        private final _Stream.Gender gender;

        Person(String name, _Stream.Gender gender) {
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
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
