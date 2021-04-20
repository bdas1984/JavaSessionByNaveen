package javainterviewquestions;

public class PrintIntValFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "qw??ki";
		
		char[] charArray = s.toCharArray();
		int len = charArray.length;
		String finalRes = "";
		
		for (int i =0;i<len;i++) {
			int temp = s.charAt(i);
			System.out.println(temp);
			
			if (temp>=97 & temp<=122) {
				finalRes += s.charAt(i);
			}
			
		}
		System.out.println(finalRes);
		

	}

}
