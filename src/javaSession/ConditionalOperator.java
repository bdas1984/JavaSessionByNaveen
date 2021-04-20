package javaSession;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		while (i<=20) {
			System.out.println(i);
			i++;
		}
		System.out.println("--------------***********------------");
		int a = 25;
		int b = 99;
		int c= 87;
		
				if (a>b && a>c) {
					System.out.println("a is the greatest");
				}
				if(b>c){
					System.out.println("b is the greatest");
				}
				else {
					System.out.println("c is the greatest");
				}
				
				//Take four numbers from the user and print the greatest number
				
				System.out.println("--------------***********------------");
		int x = 25;
		int y = 78;
		int z = 99;
		int w = 91;
		
		if (x>y && x>z && x>w) {
			System.out.println("x is the greatest number");
		}
		if (y>z && y>w) {
			System.out.println("y is the greatest number");
		}
		if (z>w) {
			System.out.println("z is the greatest number");
		}
		else {
			System.out.println("w is the greatest number");
		}
		
		//3. Write a Java program to test a number is positive or negative.
		
		System.out.println("--------------***********------------");
		
		int num = -21;
		if (num>0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is Negative");
		}
		
		//4. Write a Java program to test a person is eligible for vote
		
		System.out.println("--------------***********------------");
		
		int age = 17;
		String status = "alive";
		
		
		if (age >= 18 && status.equals("alive")) {
			System.out.println("Eligible for vote");
			
		}
		else if (age<18 && status.equals("alive")){
			System.out.println("Not Eligible to vote");
		}
		else {
			System.out.println("Person Does not exist");
		}

	}

}
