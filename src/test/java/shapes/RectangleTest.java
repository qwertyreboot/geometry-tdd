package shapes;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.api.Assertions;

class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    private void setup() {
        rectangle = new Rectangle();
    }

    @Test
    @DisplayName("verify by default the value of length and breadth is 1")
    public void verifyDefaultValuesOfAttributes() {
        Assertions.assertEquals(rectangle.getLength(), 1);
        Assertions.assertEquals(rectangle.getBreadth(), 1);
    }

    @Test
    @DisplayName("verify that the value of length cannot be -ve or 0")
    public void verifyLengthIsValid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setLength(Math.random() * -1);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setLength(0);
        });
    }

    @Test
    @DisplayName("verify that the value of breadth cannot be -ve or 0")
    public void verifyBreadthIsValid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setBreadth(Math.random() * -1);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setBreadth(0);
        });
    }

    @Test
    @RepeatedTest(value = 10, name = "testing area {currentRepetition} of {totalRepetitions}")
    @DisplayName("verify that the calculation of the area is correct")
    public void verifyAreaOutput() {
        double length = Math.random();
        double breadth = Math.random();
        rectangle.setLength(length);
        rectangle.setBreadth(breadth);
        Assertions.assertEquals(rectangle.area(), length * breadth);
    }

    @ParameterizedTest(name = "testing perimeter with {argumentsWithNames}")
    @CsvSource({"2, 3, 10", "2, 1, 6", "3, 3, 12"})
    public void verifyPerimeterOutput(double length, double breadth, double perimeter) {
        rectangle.setLength(length);
        rectangle.setBreadth(breadth);
        Assertions.assertEquals(rectangle.perimeter(), perimeter);
    }
}