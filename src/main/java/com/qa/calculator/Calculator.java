package com.qa.calculator;

import Functions.Adder;
import Functions.Divider;
import Functions.Multiplier;
import Functions.Subtracter;


public class Calculator {
	

	public double add(double num1, double num2) {
		
		Adder adder = new Adder();
		
		return adder.editTable(num1, num2);
		
	}
	public double multiply(double num1, double num2) {
		
		Multiplier multiplier = new Multiplier();
		
		return multiplier.editTable(num1, num2);
		
	}
	public double subtract(double num1, double num2) {
		
		Subtracter subtracter = new Subtracter();
		
		return subtracter.editTable(num1, num2);
	}
	public double divide(double num1, double num2) {
		
		Divider divider = new Divider();
		
		return divider.editTable(num1, num2);
	}

}
