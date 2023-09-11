package org.bootcamp;

import org.exception.NegativeDimensionException;

public class Square extends Rectangle {

    public Square(Double length) throws NegativeDimensionException {
        super(length, length);
    }
}
