
import java.util.List;

/**
 * Напишите программу, которая использует Stream API для обработки списка чисел.
 * Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1,2, 3, 4, 5, 6, 7, 8, 9, 12);

        ints.stream()
                .filter(a -> a % 2 == 0)
                .mapToInt(a->a)
                .average()
                .ifPresent(System.out::println);
    }
}