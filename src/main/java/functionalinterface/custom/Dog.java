package functionalinterface.custom;

import java.util.Objects;

public class Dog {
  private String name;
  private int age;
  private int weight;

  public Dog(String name, int age, int weight){
    this.name=name;
    this.age = age;
    this.weight=weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public int getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return "Dog{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", weight=" + weight +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Dog)) {
      return false;
    }
    Dog dog = (Dog) o;
    return getAge() == dog.getAge() && getWeight() == dog.getWeight() && Objects.equals(
        getName(), dog.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getAge(), getWeight());
  }
}
