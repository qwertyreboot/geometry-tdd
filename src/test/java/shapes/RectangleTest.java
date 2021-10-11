package shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    @DisplayName("verify by default the value of length and breadth is 1")
    public void verifyDefaultValuesOfAttributes() {
        Rectangle rectangle = new Rectangle();
        Assertions.assertEquals(rectangle.getLength(), 1);
        Assertions.assertEquals(rectangle.getBreadth(), 1);
    }

    @Test
    @DisplayName("verify that the value of length cannot be -ve or 0")
    public void verifyLengthIsValid() {
        Rectangle rectangle = new Rectangle();
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
        Rectangle rectangle = new Rectangle();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setBreadth(Math.random() * -1);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            rectangle.setBreadth(0);
        });
    }

    @Test
    @DisplayName("verify that the calculation of the area is correct")
    public void verifyAreaOutput() {
        double length = Math.random();
        double breadth = Math.random();
        Rectangle rectangle = new Rectangle(length, breadth);
        Assertions.assertEquals(rectangle.area(), length * breadth);
    }
}