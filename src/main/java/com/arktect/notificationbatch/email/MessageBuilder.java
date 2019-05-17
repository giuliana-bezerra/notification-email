package com.arktect.notificationbatch.email;

import java.io.IOException;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * This class builds a message based on
 * 
 * @author Giuliana Silva Bezerra
 *
 */
public class MessageBuilder {

	public static Message build(SessionStrategy sessionStrategy, EmailMessage emailMessage)
			throws AddressException, MessagingException, IOException {
		Message message = new MimeMessage(sessionStrategy.getSession());
		message.setFrom(new InternetAddress(emailMessage.getFrom()));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailMessage.getAddresses()));
		message.setSubject(emailMessage.getSubject());
		message.setText(emailMessage.getText());
		return message;
	}

}
