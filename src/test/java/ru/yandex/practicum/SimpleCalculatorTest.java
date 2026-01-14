package ru.yandex.practicum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    private SimpleCalculator simpleCalculator;

    @BeforeEach
    void init() {
        simpleCalculator = new SimpleCalculator();
    }

    @Test
    @DisplayName(
            "При вызове метода SimpleCalculator.subtract(int a, int b), " +
                    "где a = 10_000 и b = 100," +
                    "метод возвращает результат равный 9_900")
    void testSubtractOneHundredFromTenGrandsReturnsNineGrandsNineHundred() {
        int a = 10_000;
        int b = 100;
        int expectedResult = 9_900;

        int actualResult = simpleCalculator.subtract(a, b);

        assertEquals(expectedResult, actualResult);
    }
}
