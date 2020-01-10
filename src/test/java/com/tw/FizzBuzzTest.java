package com.tw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void shouldReturn1WhenGiven1(){
        assertThat(FizzBuzz.count(1)).isEqualTo(1);
    }
}
