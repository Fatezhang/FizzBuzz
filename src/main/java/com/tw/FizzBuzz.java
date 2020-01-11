package com.tw;

public class FizzBuzz {
    public static String of(int number) {
        return number % 3 == 0 ? "Fizz" : number % 5 == 0 ? "Buzz" : String.valueOf(number);
    }
}
