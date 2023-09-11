package org.bootcamp;

import org.exception.NegativeDimensionException;

public class Rectangle implements Shape {

    // TODO :  dont use constants
    //  use @BeforeEach, and initialise the area and perimeter there
    // cover negative TCs,

    private final Double length;
    private final Double breadth;

    public Rectangle(Double length, Double breadth) throws NegativeDimensionException {

        if(length<=0 || breadth<=0){
            throw new NegativeDimensionException("Invalid Dimension");
        }

        this.length = length;
        this.breadth = breadth;
    }


    @Override
    public Double area() {
        return this.length * this.breadth;
    }
    @Override
    public Double perimeter() {
        return 2 * (this.length + this.breadth);
    }
}
