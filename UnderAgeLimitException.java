package com.jsp.exceptionHandling;

public class UnderAgeLimitException 
             extends RuntimeException  //unchecked exception
             {
	@Override
		
     public String getMessage() {	 
    	 return "Minimum age of marriage is 20.";
     }
	}



