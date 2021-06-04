package com.week.santander.backend.exceptions;

import com.week.santander.backend.util.MessageUtils;

public class NotFoundException extends RuntimeException{
	
	public NotFoundException(){
		super(MessageUtils.NO_RECORDS_FOUND);
	}
}
