//TRY-CATCH BLOCK
package com.jsp.exceptionHandling;

public class Exception {

	public static void main(String[] args) {
		int m=24;
		int n=12;
		String s="";
     
		try {
			int res=m/n;
			System.out.println("The result is "+res);
			char ch= s.charAt(5);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
