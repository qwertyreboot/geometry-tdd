package shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square square;

    @BeforeEach
    private void setup() { square = new Square(); }

    @Test
    public void shouldThrowIllegalArgumentExceptionForNegativeSideValues() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            square.setSide(Math.random() * -1);
        });
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForSideValueZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            square.setSide(0);
        });
    }

    @Test
    public void areaShouldReturnOneForSideValueOne() {
        square.setSide(1);
        Assertions.assertEquals(square.area(), 1);
    }

    @Test
    public void areaShouldReturnFourForSideValueTwo() {
        square.setSide(2);
        Assertions.assertEquals(square.area(), 4);
    }

    @Test
    public void perimeterShouldReturnFourForSideValueOne() {
        square.setSide(1);
        Assertions.assertEquals(square.perimeter(), 4);
    }

    @Test
    public void perimeterShouldReturnEightForSideValueTwo() {
        square.setSide(2);
        Assertions.assertEquals(square.perimeter(), 8);
    }
}