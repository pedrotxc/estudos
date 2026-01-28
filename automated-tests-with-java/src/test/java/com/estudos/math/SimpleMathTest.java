package com.estudos.math;

import com.estudo.math.SimpleMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleMathTest  {

    @Test
    void testSum() {
        SimpleMath simpleMath = new SimpleMath();
        Double result = simpleMath.sum(6.2D, 2D);
        double expected = 8.2D;
        assertEquals(result, expected);
    }
}
