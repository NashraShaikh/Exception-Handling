//THROWS DECELARATION
package com.jsp.exceptionHandling;

public class Exception2 {

	public static void main(String[] args) 
			throws ArithmeticException, 
			StringIndexOutOfBoundsException {
		int m=24;
		int n=12;
		String s="";
		
		int res=m/n;
		System.out.println(res);
		
		char ch=s.charAt(5);
		System.out.println(ch);

	}

}
