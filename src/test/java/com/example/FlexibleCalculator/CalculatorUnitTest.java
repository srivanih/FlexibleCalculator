package com.example.FlexibleCalculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.mock;

public class CalculatorUnitTest {

	private static final double RIGHT = 10.0;
	private static final double LEFT = 20.0;
	private static final double SUM = 30.0;
	private static final double SUBTRACTION_RESULT = 10.0;
	private static final double DIVISION_RESULT = 2.0;
	private static final double MULTIPLICATION_RESULT = 200.0;
	
	private Calculator calculator;
	@Autowired
	private CalculatorOperation calculatorOperation;
	
	@BeforeEach
	public void setUp() {
		 calculator = new Calculator();

	}

	@Test
	public void whenAddTwoNumber_returnSum() {

		OperationEnum operation= OperationEnum.ADD;
		double result = calculator.calculate(operation, LEFT, RIGHT);
		Assertions.assertEquals(SUM, result, 0.0);
	}

	@Test
	public void whenAddTwoNumber_returnSumOld() {
		Addition addition = new Addition(LEFT, RIGHT);
		calculator.calculateold(addition);
		Assertions.assertEquals(SUM, addition.getResult(), 0.0);
	}

	@Test
	public void whenSutractTwoNumber_returnCorrectResult() {
		OperationEnum operation= OperationEnum.SUBTRACT;
		double result = calculator.calculate(operation, LEFT,RIGHT);
		Assertions.assertEquals(SUBTRACTION_RESULT,result, 0.0);
	}

	@Test
	public void whenDivideTwoNumber_returnCorrectResult() {

		OperationEnum operation= OperationEnum.DIVIDE;
		double result = calculator.calculate(operation, LEFT,RIGHT);
		Assertions.assertEquals(DIVISION_RESULT, result, 0.0);
	}

	@Test
	public void whenMultiplyTwoNumber_returnCorrectResult() {

		OperationEnum operation= OperationEnum.MULTIPLY;
		double result = calculator.calculate(operation, LEFT,RIGHT);
		Assertions.assertEquals(MULTIPLICATION_RESULT, result, 0.0);
	}


}
