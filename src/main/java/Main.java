import java.io.IOException;

/**
 * A simple main class for running the spelling corrector. This class is not
 * used by the passoff program.
 */
public class Main {

	/**
	 * Give the dictionary file name as the first argument and the word to correct
	 * as the second argument.
	 */
	public static void main(String[] args) throws IOException {

		String operation = args[0];
		String inputOne = args[1];
		String inputTwo = args[2];

		Calculator calculator = new Calculator();

		if (operation.equals("add")) {

			System.out.println(calculator.add(Integer.getInteger(inputOne), Integer.getInteger(inputTwo)));

		} else if (operation.equals("subtract")) {

			System.out.println(calculator.subtract(Integer.valueOf(inputOne), Integer.valueOf(inputTwo)));

		} else if (operation.equals("multiply")) {

			System.out.println(calculator.multiply(Integer.valueOf(inputOne), Integer.valueOf(inputTwo)));

		} else if (operation.equals("divide")) {

			System.out.println(calculator.divide(Integer.valueOf(inputOne), Integer.valueOf(inputTwo)));

		} else if (operation.equals("fibonacci")) {

			System.out.println(calculator.fibonacciNumberFinder(Integer.valueOf(inputOne)));

		} else if (operation.equals("binary")) {

			System.out.println(calculator.intToBinaryNumber(Integer.getInteger(inputOne)));

		}

	}

}
