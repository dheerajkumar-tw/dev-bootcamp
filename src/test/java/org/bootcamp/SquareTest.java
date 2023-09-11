package org.bootcamp;

import org.exception.NegativeDimensionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void shouldReturnArea25WhenLengthIs5() throws NegativeDimensionException {

        final Double LENGTH = 5.0;
        final Double AREA = 25.0;
        Shape square = new Square(LENGTH);
        Double area = square.area();
        assertEquals(AREA, area);
    }

    @Test
    public void shouldReturnPerimeter20WhenLengthIs5() throws NegativeDimensionException {
        final Double LENGTH = 5.0;
        final Double PERIMETER = 20.0;
        Shape square = new Square(LENGTH);
        Double area = square.perimeter();
        assertEquals(PERIMETER, area);
    }
}

