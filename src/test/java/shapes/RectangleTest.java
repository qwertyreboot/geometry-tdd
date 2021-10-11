package shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    public void verifyAreaOutput() {
        Rectangle rectangle = new Rectangle(5, 10);
        Assertions.assertEquals(rectangle.area(), 50);
    }
}