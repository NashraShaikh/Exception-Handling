package com.jsp.exceptionHandling;
import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your present age: ");
        int age=sc.nextInt();
        
        if(age<20) {
        	try {
        		throw new UnderAgeLimitException();
        	}
        	catch(UnderAgeLimitException e){
        		e.printStackTrace();
        		System.out.println(e.getMessage());
        	}
        }
        else if(age>=40) {
        	try {
        		throw new OverAgeLimitException();
        	}
        	catch(OverAgeLimitException e){
        		e.printStackTrace();
        		System.out.println(e.getMessage());
        	}
        }
        else
        {
        	System.out.println("You are eligible to get married");
        }
	}

}
