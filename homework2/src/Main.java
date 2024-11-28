import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Используя Reflection API, напишите программу, которая выводит на экран все методы класса String.
 */
public class Main {
    public static void main(String[] args) {
        Arrays.stream(String.class.getMethods())
                .map(Method::getName)
                .forEach(System.out::println);
    }
}