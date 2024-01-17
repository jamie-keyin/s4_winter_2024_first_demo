package com.keyin.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void testIsTrue() {
        ExampleToTest exampleToTestUnderTest = new ExampleToTest();

        Assertions.assertTrue(exampleToTestUnderTest.isTrue());
    }

}
