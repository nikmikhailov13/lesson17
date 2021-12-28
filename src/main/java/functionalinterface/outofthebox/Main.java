package functionalinterface.outofthebox;

import functionalinterface.custom.Dog;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

  public static void main(String[] args) {

    Predicate<Integer> predicate = number -> number % 2 != 0;
    System.out.println(predicate.test(3));

    Consumer<Dog> consumer = System.out::println;
    consumer.accept(new Dog("Max", 10, 40));

    Supplier<Integer> supplier = () -> {
      Random random = new Random();
      return random.nextInt();
    };
    System.out.println(supplier.get());
    Supplier<NullPointerException> exceptionSupplier = () -> {
      throw new NullPointerException("Hello, I'm NPE");
    };

    try {
      exceptionSupplier.get();
    } catch (NullPointerException e) {
      System.out.println(e.getMessage());
    }
    Function<Integer, String> convert = (Integer x) -> "I'm string: " + x.toString();
    System.out.println(convert.apply(441));

    UnaryOperator<Double> unaryOperator = number -> Math.sqrt(number);
    System.out.println(unaryOperator.apply(4.0));

    BinaryOperator<Integer> binaryOperator = (num1, num2) -> {
      String string = num1.toString() + num2.toString();
      return Integer.valueOf(string);
    };

    System.out.println(binaryOperator.apply(5, 5));
  }
}
