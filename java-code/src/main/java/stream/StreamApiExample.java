package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("QWERTY", "qwe", "qwe qwe", "qwe qwe asd", " qwertyqwerty ");
        List<Integer> integerList = new ArrayList<>();

        //Количество букв в каждой строке листа + сумма всех букв в листе
        int sum1 = stringList.stream()
                .map(s -> s.replaceAll("\\s+", ""))
                .mapToInt(String::length)
                .peek(integerList::add)
                .sum();
        System.out.println(stringList);
        System.out.print(integerList);
        System.out.println("   sum1: " + sum1);

        //Количество всех букв в листе вариант 2
        int sum2 = stringList.stream()
                .flatMap((s) -> Arrays.stream(s.split(" ")))
                .mapToInt(String::length)
                .sum();
        System.out.println("sum2: " + sum2);

        //Последовательность чисел Фибоначчи, первые 10
        integerList.clear();
        Stream.iterate(new int[]{1, 1}, a -> new int[]{a[1], a[0] + a[1]})
                .limit(10)
                .map(a -> a[0])
                .peek(i -> System.out.print(" "))
                .peek(integerList::add)
                .forEach(System.out::print);
        System.out.println();

        //Последовательность чисел Фибоначчи, сумма четных среди первых 10
        int sumEvenNumbers = integerList.stream()
                .filter(i -> i % 2 == 0)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println("sumEvenNumbers = " + sumEvenNumbers);
    }
}
