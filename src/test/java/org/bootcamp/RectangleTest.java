package org.bootcamp;

import org.exception.NegativeDimensionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {



    @Test
    public void shouldReturnArea25WhenLengthIs5AndBreadthIs4() throws NegativeDimensionException {

        final Double LENGTH = 5.0;
        final Double BREADTH = 4.0;
        final Double AREA = 20.0;
        Shape rectangle = new Rectangle(LENGTH, BREADTH);
        Double area = rectangle.area();
        assertEquals(AREA, area);
    }

    @Test
    public void shouldReturnPerimeter18WhenLengthIs5AndBreadthIs4() throws NegativeDimensionException {
        final Double LENGTH = 5.0;
        final Double BREADTH = 4.0;
        Shape rectangle = new Rectangle(LENGTH, BREADTH);
        final Double perimeter = 18.0;;
        assertEquals(perimeter, rectangle.perimeter());
    }

    @Test
    public void shouldThrowExceptionWhenLengthIsNegative() throws NegativeDimensionException {
        final Double LENGTH = -1.0;
        final Double BREADTH = 4.0;

        assertThrows(NegativeDimensionException.class, () -> new Rectangle(LENGTH, BREADTH));
    }
}

