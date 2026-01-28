package com.estudos.math;

import com.estudo.math.SimpleMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath simpleMath = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double sum = simpleMath.sum(firstNumber, secondNumber);

        double expected = 8.2D;
        assertEquals(expected, sum, () -> firstNumber + " + " + secondNumber + " did not produce " + expected + "!");
        assertNotNull(sum);
    }

    @Test
    void testSubtraction() {
        SimpleMath simpleMath = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double subtraction = simpleMath.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;
        assertEquals(expected, subtraction, () -> firstNumber + " - " + secondNumber + " did not produce " + expected + "!");
    }

    @Test
    void testMultiplication() {
        SimpleMath simpleMath = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double multiplication = simpleMath.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;
        assertEquals(expected, multiplication, () -> firstNumber + " * " + secondNumber + " did not produce " + expected + "!");
    }

    @Test
    void testDivision() {
        SimpleMath simpleMath = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double division = simpleMath.division(firstNumber, secondNumber);
        double expected = 3.1D;
        assertEquals(expected, division, () -> firstNumber + " / " + secondNumber + " did not produce " + expected + "!");
    }

    @Test
    void testMean() {
        SimpleMath simpleMath = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double mean = simpleMath.mean(firstNumber, secondNumber);
        double expected = 4.1D;
        assertEquals(expected, mean, () -> "(" + firstNumber + " + " + secondNumber + ") / 2" + " did not produce " + expected + "!");
    }

    @Test
    void testSquareRoot() {
        SimpleMath simpleMath = new SimpleMath();
        double number = 9D;

        Double squareRoot = simpleMath.squareRoot(number);
        double expected = 3D;
        assertEquals(expected, squareRoot, () -> "Square root of " + number + " did not produce " + expected + "!");
    }

    // Teste demonstrativo para comparar Eager vs Lazy Assertions
    @Test
    void testLazyVsEagerAssertion() {
        SimpleMath simpleMath = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double sum = simpleMath.sum(firstNumber, secondNumber);
        double expected = 8.2D;

        /*
         Cenário 1: Eager (Sem Lambda)
         O Java precisa calcular o valor da String ANTES de passar para o método assertEquals.
         Portanto, o método 'buildMessage' É executado, mesmo que o teste passe.
        */
        StringBuilder eagerLog = new StringBuilder();
        assertEquals(expected, sum, buildMessage(eagerLog));
        assertTrue(eagerLog.length() > 0, "Sem lambda, a mensagem foi construída desnecessariamente!");

        /*
         Cenário 2: Lazy (Com Lambda)
         Passamos uma função (Supplier) para o assertEquals.
         O assertEquals só chama essa função SE o teste falhar.
        */
        StringBuilder lazyLog = new StringBuilder();
        assertEquals(expected, sum, () -> buildMessage(lazyLog));
        assertTrue(lazyLog.length() == 0, "Com lambda, a mensagem NÃO deveria ser construída se o teste passar!");
    }

    private String buildMessage(StringBuilder log) {
        log.append("Construindo mensagem...");
        return "Mensagem de erro";
    }
}