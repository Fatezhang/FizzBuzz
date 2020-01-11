package com.tw;

public class FizzBuzz {
    public static String of(int number) {
        return number % 3 == 0 ? "Fizz" : String.valueOf(number);
    }
}
