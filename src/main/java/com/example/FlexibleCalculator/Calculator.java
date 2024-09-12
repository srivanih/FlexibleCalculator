package com.example.FlexibleCalculator;

import org.springframework.beans.factory.annotation.Autowired;

import java.security.InvalidParameterException;

public class Calculator {




    public void calculateold(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

        operation.perform();
    }


    public double calculate(OperationEnum operation, double num1, double num2) {
        if (operation.toString() == null ) {
            throw new InvalidParameterException("Can not perform operation");
        }

       return operation.getOperation (operation, num1,num2).perform();

    }
}