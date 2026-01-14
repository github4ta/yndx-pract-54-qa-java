package ru.yandex.practicum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

    @Test
    @DisplayName("Тестировать метод умножать(double a, double b) для положительных чисел a = 100.0, b = 10.0 когда ожидаемый результат 1000.0")
    public void testMultiplyWithPositiveNumbersInDoubleThatReturnsResultInDouble() {
        Assertions.assertEquals(1000.0, new SimpleCalculator().multiply(100.0, 10.0));
    }
}
