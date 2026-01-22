package com.pedrotxc.rest_with_spring_boot_and_java.math.controllers;

import com.pedrotxc.rest_with_spring_boot_and_java.exception.ResourceNotFoundException;
import com.pedrotxc.rest_with_spring_boot_and_java.math.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.pedrotxc.rest_with_spring_boot_and_java.math.converters.NumberConverter.convertToDouble;
import static com.pedrotxc.rest_with_spring_boot_and_java.math.converters.NumberConverter.isNumeric;

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath simpleMath = new SimpleMath();

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new ResourceNotFoundException("Please set a numeric value!");

        return simpleMath.sum(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new ResourceNotFoundException("Please set a numeric value!");

        return simpleMath.subtraction(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping("/mut/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new ResourceNotFoundException("Please set a numeric value!");

        return simpleMath.multiplication(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new ResourceNotFoundException("Please set a numeric value!");

        return simpleMath.division(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping("/med/{numberOne}/{numberTwo}")
    public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new ResourceNotFoundException("Please set a numeric value!");

        return simpleMath.mean(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping("/sqr/{numberOne}")
    public Double squareRoot(@PathVariable("numberOne") String numberOne) throws Exception {
        if (!isNumeric(numberOne))
            throw new ResourceNotFoundException("Please set a numeric value!");

        return simpleMath.squareRoot(convertToDouble(numberOne));
    }

}
