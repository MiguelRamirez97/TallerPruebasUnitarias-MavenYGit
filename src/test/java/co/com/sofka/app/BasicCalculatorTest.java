package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several rest")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "10,    5,   5",
            "1,    2,   -1",
            "100,  51, 49",
            "1,  100, -99"
    })
    public void severalRest(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.Resta(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several multiply")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "10,    5,   50",
            "1,    2,   2",
            "100,  -51, -5100",
            "-20,  16, -320"
    })
    public void severalMultiply(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.Multiplicacion(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several Divid")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "10,    2,   5",
            "-1,    2,   -0.5",
            "77,  22, 3.5",
            "19,  0, Infinity"
    })
    public void severalDivision(Double first, Double second, Double expectedResult) {
        assertEquals(expectedResult, (basicCalculator.Division(first, second)),
                () -> first + " / " + second + " should equal " + expectedResult);
    }

}