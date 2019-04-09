package com.test;

import com.company.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class SquareTest {

    private Square square;

    @BeforeEach
    public void setUp() {
        square = new Square(4);
    }

    @Test
    public void testThrow() {
        Executable ex = () -> new Square(-3);
        Assertions.assertThrows(IllegalArgumentException.class, ex);
    }

    @Test
    public void calculateFieldTest() {
        Assertions.assertEquals(16, square.calculateField(), 0.0001);
        Assertions.assertNotEquals(4, square.calculateField(), 0.0001);
    }

    @Test
    public void calculateCircuitTest() {
        Assertions.assertEquals(16, square.calculateCircuit(), 0.0001);
        Assertions.assertNotEquals(8, square.calculateCircuit(), 0.0001);
    }

    @Test
    public void enlargeTest() {
        square.enlarge(3.4);
        Assertions.assertEquals(4*3.4, square.getSide(), 0.0001);
        Assertions.assertEquals(4*4*3.4*3.4, square.calculateField(), 0.0001);
        Assertions.assertEquals((4*3.4)*4, square.calculateCircuit(), 0.0001);
    }
}
