package javainterviewquestions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Main.x);

	}

}

class Main{
	
	public static final int x= 200;
	static {
		System.out.println("main-- class static block");
	}
}