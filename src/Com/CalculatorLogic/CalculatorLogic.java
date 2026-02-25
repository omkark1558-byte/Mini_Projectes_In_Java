package Com.CalculatorLogic;

public class CalculatorLogic {

	    public double calculate(double a, double b, String operator) {

	        switch (operator) {
	            case "+":
	                return a + b;

	            case "-":
	                return a - b;

	            case "*":
	                return a * b;

	            case "/":
	                if (b != 0)
	                    return a / b;
	                else
	                    throw new ArithmeticException("Cannot divide by zero");

	            default:
	                throw new IllegalArgumentException("Invalid Operator");
	        }
	    }
	}
