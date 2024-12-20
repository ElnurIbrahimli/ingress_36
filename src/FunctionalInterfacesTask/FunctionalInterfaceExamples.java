package FunctionalInterfacesTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfaceExamples {
    public static void main(String[] args) {
        System.out.println("1. Words in uppercase:");
        List<String> words = Arrays.asList("hello", "world", "java", "consumer");
        Consumer<String> printUpperCase = word -> System.out.println(word.toUpperCase());
        words.forEach(printUpperCase);


        System.out.println("\n2. Current date and time:");
        Supplier<String> currentDateTimeSupplier = () -> {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm (EEEE) - dd MMM yyyy");
            return now.format(formatter);
        };
        System.out.println(currentDateTimeSupplier.get());



        System.out.println("\n3. Word lengths:");
        Function<String, Integer> wordLengthFunction = String::length;
        List<Integer> wordLengths = words.stream()
                .map(wordLengthFunction)
                .collect(Collectors.toList());
        System.out.println(wordLengths);

    }


}
