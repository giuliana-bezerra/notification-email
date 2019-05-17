package com.arktect.notificationbatch.email;

import java.io.IOException;

import javax.mail.Session;

import com.arktect.notificationbatch.config.EmailConfiguration;

/**
 * This session strategy uses no authentication.
 * 
 * @author Giuliana Silva Bezerra
 *
 */
public class DefaultSessionStrategy implements SessionStrategy {

	public Session getSession() throws IOException {
		return Session.getInstance(EmailConfiguration.getInstance().getProperties());
	}

}
