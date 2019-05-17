package com.arktect.notificationbatch.email;

import java.io.IOException;
import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import com.arktect.notificationbatch.config.EmailConfiguration;

/**
 * This session strategy uses a password authentication.
 * 
 * @author Giuliana Silva Bezerra
 *
 */
public class SessionPasswordStrategy implements SessionStrategy {

	public Session getSession() throws IOException {
		final String username = EmailConfiguration.getInstance().getProperty("username");
		final String password = EmailConfiguration.getInstance().getProperty("password");
		final Properties props = EmailConfiguration.getInstance().getProperties();
		
		return Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
	}

}
