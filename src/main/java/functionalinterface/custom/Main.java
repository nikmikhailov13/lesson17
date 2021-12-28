package functionalinterface.custom;

public class Main {

  public static void main(String[] args) {

    Converter<Dog, Racoon> convertor = dog -> new Racoon(dog.getName(), dog.getAge(), dog.getWeight());

    Dog max = new Dog("Max", 4, 30);
    Racoon racoon = convertor.convert(max);
    System.out.println(racoon);

    System.out.println(Converter.checkNotNull(max));

    convertor.print(max);
  }


}
