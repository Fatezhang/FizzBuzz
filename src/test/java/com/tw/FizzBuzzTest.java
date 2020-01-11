package com.tw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void shouldReturn1WhenGiven1() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
    }

    @Test
    void shouldReturn1And2WhenGiven2() {
        assertThat(FizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    void shouldReturnFizzWhenGivenMultipleOf3() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(9)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(33)).isEqualTo("Fizz");
    }

    @Test
    void shouldReturnFizzWhenGivenMultipleOf5() {
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(10)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(25)).isEqualTo("Buzz");
    }

    @Test
    void shouldReturnFizzWhenGivenMultipleOf7() {
        assertThat(FizzBuzz.of(7)).isEqualTo("Whizz");
        assertThat(FizzBuzz.of(14)).isEqualTo("Whizz");
        assertThat(FizzBuzz.of(28)).isEqualTo("Whizz");
    }

    @Test
    void shouldReturnFizzBuzzWhenGivenMultipleOf3And5(){
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void shouldReturnFizzBuzzWhenGivenMultipleOf3And7(){
        assertThat(FizzBuzz.of(21)).isEqualTo("FizzWhizz");
    }

    @Test
    void shouldReturnFizzBuzzWhenGivenMultipleOf5And7(){
        assertThat(FizzBuzz.of(35)).isEqualTo("BuzzWhizz");
    }

    @Test
    void shouldReturnFizzBuzzWhenGivenMultipleOf3And5And7(){
        assertThat(FizzBuzz.of(210)).isEqualTo("FizzBuzzWhizz");
    }
}
