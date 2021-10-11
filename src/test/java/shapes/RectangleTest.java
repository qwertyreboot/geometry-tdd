package shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    public void verifyAreaOutput() {
        double length = Math.random();
        double breadth = Math.random();
        Rectangle rectangle = new Rectangle(length, breadth);
        Assertions.assertEquals(rectangle.area(), length * breadth);
    }
}