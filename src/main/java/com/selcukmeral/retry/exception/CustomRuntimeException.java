package com.selcukmeral.retry.exception;

public class CustomRuntimeException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomRuntimeException(Exception ex) {
		super(ex.getMessage(), ex);
	}
	
	public CustomRuntimeException(String msg) {
		super(msg);
	}
	
	public CustomRuntimeException(String msg ,Exception ex) {
		super(msg,ex);
	}
	

}
