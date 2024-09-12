package com.example.FlexibleCalculator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public enum OperationEnum {

    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    public CalculatorOperation getOperation(OperationEnum operation, double num1,double num2) {

        // this will refer to the object SMALL
        switch (operation) {
            case ADD:
                Addition addition = new Addition(num1, num2);
                return addition;

            case SUBTRACT:
                Subtraction subtraction = new Subtraction(num1, num2);
                return subtraction;

            case MULTIPLY:
                Multiplication multiplication = new Multiplication(num1, num2);
                return multiplication;

            case DIVIDE:
                Division division = new Division(num1, num2);
                return division;

            default:
                return null;
        }
    }


    // OperationEnum(){
    // this.toString();
    // }
   /* public OperationEnum get(final String identifier) {
        for (OperationEnum e : values()) {
            if (e.identifier == identifier) {
                return e;
            }
        }
        throw new IllegalArgumentException(); // or return null if you want
    }*/


   /* process(OperationEnum operation,Double  num1, Double num2){

        if(OperationEnum.ADD.equals(operation))

            Addition addition = new Addition(num1,num2);
        }
    }
    @Override
    public void perform() {
        result = left + right;
    }


   /* ADD         ((a,b) -> a+b),
    SUBTRACT        ((a,b) -> a-b),
    MULTIPLY        ((a,b) -> a*b),
    DIVIDE     ((a,b) -> a/b);

    private static Map<Character, OperationEnum> operations =
            new HashMap<Character, OperationEnum>() {{
                put('+', ADD);
                put('-', SUBTRACT);
                put('x', MULTIPLY);
                put('/', DIVIDE);
            }};

    private BinaryOperator<Integer> operation;

    OperationEnum(BinaryOperator<Integer> operation) {
        this.operation = operation;
    }

    public static OperationEnum of(char op) {
        if(!operations.containsKey(op)) throw new IllegalArgumentException();

        return operations.get(op);
    }

    public int operate(int a, int b) {
        return operation.apply(a,b);
    }*/


}
