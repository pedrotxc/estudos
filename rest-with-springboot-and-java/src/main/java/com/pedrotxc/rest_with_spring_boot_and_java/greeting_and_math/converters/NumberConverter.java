package com.pedrotxc.rest_with_spring_boot_and_java.greeting_and_math.converters;

import com.pedrotxc.rest_with_spring_boot_and_java.greeting_and_math.exception.UnsuportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) {
        if (strNumber == null || strNumber.isEmpty())
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty())
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

}
