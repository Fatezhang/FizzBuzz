package com.tw;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzz {
    public static List<String> of(List<Integer> numbers) {
        return numbers.stream().flatMap(
                num -> Stream.of(num % 3 == 0 ? "Fizz" : String.valueOf(num)))
                .collect(Collectors.toList());
    }
}
