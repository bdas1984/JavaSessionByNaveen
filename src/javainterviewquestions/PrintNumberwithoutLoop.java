package javainterviewquestions;

import java.util.stream.IntStream;

public class PrintNumberwithoutLoop {
	
	/**
	 * Print 1 to 100 without using loop
	 * 1. recursive function
	 * 2.Java Streams
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//printNum(20);
//printNum(2,40);

IntStream.range(2, 50).forEach(e->System.out.println(e));
	}
	
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	public static void printNum(int startNum, int endNum) {
		if(startNum<=endNum) {
			System.out.println(startNum);
			startNum++;
			printNum(startNum, endNum);
		}
		
	}

}
