package com.arktect.notificationbatch.email;

public interface EmailMessage {
	String getText();

	String getSubject();

	String getFrom();

	String getAddresses();
}
