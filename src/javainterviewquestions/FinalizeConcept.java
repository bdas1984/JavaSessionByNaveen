package javainterviewquestions;

public class FinalizeConcept {

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		division();

	}
	
	public static void division() {
		int i=10;
		try {
			System.out.println("Inside try block");
			int j = i/0;
			System.out.println(j);
		}
		catch(NullPointerException e) {
			System.out.println("Inside catch block");
			System.out.println("divide by zero erro");
			
		}
		finally {
			System.out.println("Finally block will get executed despite of method throws exception or not");
		}
	}

}
