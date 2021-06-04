package com.week.santander.backend.exceptions;

public class BusinessException extends RuntimeException{
	
	public BusinessException(String message){
		super(message);
	}
}
