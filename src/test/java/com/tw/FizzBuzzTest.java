package com.tw;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void shouldReturn1WhenGiven1() {
        assertThat(FizzBuzz.count(Collections.singletonList(1))).isEqualTo(Collections.singletonList(1));
    }

    @Test
    void shouldReturn1And2WhenGiven1And2() {
        assertThat(FizzBuzz.count(Arrays.asList(1, 2))).isEqualTo(Arrays.asList(1, 2));
    }
}
