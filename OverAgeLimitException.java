package com.jsp.exceptionHandling;

public class OverAgeLimitException extends RuntimeException
   {
    public String getMessage() {
		return "Maximum age of marriage is 40.";
    }
}
