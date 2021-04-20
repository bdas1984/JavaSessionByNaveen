package javainterviewquestions;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Selenium";
		int len = s.length();
		String rev="";
		
		for(int i=len-1; i>=0; i--) {
			rev = rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		//2 using StringBuffer class
		
		StringBuffer sb = new StringBuffer(s);
		StringBuffer se = sb.reverse();
		System.out.println(se);
		
		
		String s1 = "Bangalore is the city";
		String[] str = s1.split(" ");
		int len1 = str.length;
		System.out.println(len1);
		String rev1 = "";
		String res = "";
		for (String str2 : str) {
			
			for (int j=str2.length(); j>=0; j--) {
				rev1 = rev1 + str2.charAt(j);
			}
			res = res + rev1 +" ";
			rev1= "";
		}
		System.out.println(res+" ");
		

	}

}
