package stream;

import functionalinterface.custom.Dog;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Dog> dogs = List.of(
        new Dog("Dog2", 6, 11),
        new Dog("Dog1", 5, 10),
        new Dog("Dog1", 5, 10),
        new Dog("Dog3", 7, 20));

    dogs.stream()
        .filter(dog -> dog.getAge() < 7)
        .map(dog -> new Dog(dog.getName() + " after stream", dog.getAge(), dog.getWeight()))
        // .limit(1)
        // .skip(1)
        .sorted(Comparator.comparingInt(Dog::getAge))
        .distinct()
        //.dropWhile(dog -> dog.getWeight() > 9)
        .collect(Collectors.toList());

  }
}
