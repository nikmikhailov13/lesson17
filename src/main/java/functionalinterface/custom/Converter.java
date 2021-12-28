package functionalinterface.custom;

@FunctionalInterface
public interface Converter<T, S> {

  public static <T> boolean checkNotNull(T t) {
    return t != null;
  }

  public S convert(T t);

  public default void print(T t) {
    System.out.println(t.toString());
  }
}
