package ru.yandex.practicum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    private final SimpleCalculator simpleCalculator = new SimpleCalculator();

    @Test
    @DisplayName("Сложение положительных целых чисел")
    void testSumWithPositiveNumberShouldReturnCorrectSum() {
        int a = 10;
        int b = 100;
        int result = simpleCalculator.add(a, b);
        assertEquals(110, result);
    }

    @Test
    @DisplayName("Сложение целого положительного числа с нулем")
    void testSumWithZeroShouldReturnSameNumber() {
        int a = 0;
        int b = 100;
        int result = simpleCalculator.add(a, b);
        assertEquals(100, result);
    }

    @Test
    @DisplayName("Сложение целых нулей")
    void testSumWithTwoZerosShouldReturnZero() {
        int a = 0;
        int b = 0;
        int result = simpleCalculator.add(a, b);
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Сложение максимального значения целого числа и 1")
    void testSumWithLargeNumbersShouldReturnCorrectSum() {
        int a = Integer.MAX_VALUE;
        int b = 1;
        int result = simpleCalculator.add(a, b);
        assertEquals(Integer.MIN_VALUE, result); // Проверка переполнения
    }
}
