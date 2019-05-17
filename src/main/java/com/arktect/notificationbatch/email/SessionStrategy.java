package com.arktect.notificationbatch.email;

import java.io.IOException;

import javax.mail.Session;

public interface SessionStrategy {
	Session getSession() throws IOException;
}
