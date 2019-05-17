package com.arktect.notificationbatch.exception;

/**
 * This class represents an exception thrown during sending email.
 * 
 * @author Giuliana Silva Bezerra
 *
 */
public class EmailException extends Exception {

	private static final long serialVersionUID = 6596513009654212447L;

	public EmailException(String message) {
		super(message);
	}

}