package com.arktect.notificationbatch.email;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;

/**
 * This class sends an email using a template.
 * 
 * @author Giuliana Silva Bezerra
 *
 */
public class SendEmailSSL {
	public static void send(Message message) {
		try {
			Transport.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
