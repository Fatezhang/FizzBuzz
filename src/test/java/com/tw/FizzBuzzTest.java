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
    }
}
