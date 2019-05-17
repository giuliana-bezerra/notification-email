package com.arktect.notificationbatch.email;

import java.util.HashMap;
import java.util.Map;

import javax.mail.Message;

/**
 * This is a client for sending email.
 * 
 * @author Giuliana Silva Bezerra
 *
 */
public class EmailClient {
	public static void main(String[] args) throws Exception {
		Map<String, String> msgValues = new HashMap<String, String>();
		msgValues.put("name", "Giu");

		Message message = MessageBuilder.build(new SessionPasswordStrategy(),
				new InvitationEmailMessage(
						"Hi, ${name}! You have received an invitation to join an organization in Arktect.",
						"arktectemail@gmail.com", msgValues));

		SendEmailSSL.send(message);
	}

}