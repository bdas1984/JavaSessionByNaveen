package javainterviewquestions;

public class ElementPresentInOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {10,-11,23,43,-55,20};
		
		int flag=0;
		/*
		 * for (int i =0; i<arr.length; i++) { System.out.println(i);
		 * 
		 * }
		 */
		
		/*
		 * for (int i=0; i<arr.length; i++) { if (flag == 1) { System.out.println(arr[i]
		 * + " " ); flag =0; }else { flag=1; } }
		 */
		
		for (int i=0;i<arr.length;i++) {
			if (i%2 !=0) {System.out.println(arr[i]);}
		}
	}

}
