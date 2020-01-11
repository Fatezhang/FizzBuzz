package com.tw;

public class FizzBuzz {
    public static String of(int number) {
        return number % 3 == 0 && number % 5 == 0 && number % 7 == 0 ? "FizzBuzzWhizz"
                : number % 3 == 0 && number % 7 == 0 ? "FizzWhizz"
                : number % 3 == 0 && number % 5 == 0 ? "FizzBuzz"
                : number % 5 == 0 && number % 7 == 0 ? "BuzzWhizz"
                : number % 5 == 0 ? "Buzz"
                : number % 3 == 0 ? "Fizz"
                : number % 7 == 0 ? "Whizz"
                : String.valueOf(number);
    }
}
