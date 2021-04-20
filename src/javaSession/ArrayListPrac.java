package javaSession;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"b","f","r","t","y","u"};
		
		
		/*
		 * We can convert an array into arraylist in following ways....
		 * Using Arrays.asList() method
		 * pass the required array to this method and get a List object and pass it as a
		 * parameter to the constructor of ArrayList class.
		 */
		
	
		List<String> ll  = Arrays.asList(arr);
		System.out.println(ll);
		
		ArrayList<String> al = new ArrayList<String>(ll);
		System.out.println(al);
		al.add("m");
		
		System.out.println(al);
		
		System.out.println("---------------*************-------------------");
		
		/*
		 * Iteration method
		 */
		
		List<String> al2 = new ArrayList<>();
		for (String st : arr) {
			al2.add(st);
			System.out.print(st + " ");
		}
		
		/*
		 *  Write a Java program to insert an element into the array list at the first and last positions.
		 */
		
		System.out.println("-----------------**************-----------------");
		ArrayList<Integer> alIn = new ArrayList<Integer>();
		alIn.add(23);
		alIn.add(45);
		alIn.add(56);
		
		System.out.println(alIn);
		alIn.add(0, 1);// used to insert element in specified index.
		alIn.add(99); // used to insert element in last position.
		System.out.println(alIn);
		System.out.println(alIn.get(2)); //By using get method will get the element from the specified index.
		
		
		/*
		 * 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
		 */
		
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("white");
		color.add("Brown");
		
		System.out.println(color);
		color.remove(3); //
		System.out.println(color);
		
		
	}

}
