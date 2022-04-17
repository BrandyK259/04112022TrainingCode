package revature.TestUnitLecture;

public class MyCalculator {

	public String firstHalf;
	public String secondHalf;
	public String operator;
	public double answer;
	
	public double calculate(String input) {
		
		//Parse input into two number strings
		
		for(int i = 0; i < input.length(); i++) {
			//Get first number
			if(operator == null)
			{
				firstHalf += Character.toString(input.charAt(i));
			}
			//Assign operator
			else if(input.charAt(i) == '+' || input.charAt(i) == '-' 
					|| input.charAt(i) == '*' || input.charAt(i) == '/' 
					||input.charAt(i) == '%') 
			{
				System.out.println("Entered operator if statement");
				operator = Character.toString(input.charAt(i));
			}
			//Get second number
			//secondHalf = input.substring(i+1);
			else if (operator != null) 
			{
				System.out.println("Entered second number if statement");
				secondHalf += Character.toString(input.charAt(i));
			}
		}
		
		//Parse strings into ints
		String firstStringNumber = firstHalf.replaceAll("[^0-9]", "");
		int firstNum = Integer.parseInt(firstStringNumber);
		
		String secondStringNumber = secondHalf.replaceAll("[^0-9]", "");
		int secondNum = Integer.parseInt(secondStringNumber);
		
		double firstNumD = firstNum;
		double secondNumD = secondNum;
		
		//Perform calculation
		switch ( operator) {
		case "+":
			answer = firstNumD + secondNumD;
			break;
		case "-":
			answer = firstNumD - secondNumD;
			break;
		case "*":
			answer = firstNumD * secondNumD;
			break;
		case "/":
			answer = firstNumD / secondNumD;
			break;
		case "%":
			answer = firstNumD % secondNumD;
			break;
		}
	
		return answer;
	}
}
