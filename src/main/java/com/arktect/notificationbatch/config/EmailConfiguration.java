package com.arktect.notificationbatch.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class manages the email configuration used by notification-batch.
 * 
 * @author Giuliana Silva Bezerra
 *
 */
public class EmailConfiguration {

	private Properties properties = new Properties();
	private InputStream inputStream = null;
	private static EmailConfiguration singleton;

	public static EmailConfiguration getInstance() throws IOException {
		if (singleton == null)
			singleton = new EmailConfiguration();
		return singleton;
	}

	private EmailConfiguration() throws IOException {
		inputStream = new FileInputStream("/etc/config/notificationbatch/email.properties");
		properties.load(inputStream);
	}

	public Properties getProperties() {
		return properties;
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

}
