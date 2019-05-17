package com.arktect.notificationbatch.email;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.lang3.text.StrSubstitutor;

import com.arktect.notificationbatch.config.EmailConfiguration;

/**
 * 
 * @author Giuliana Silva Bezerra
 *
 */
public class InvitationEmailMessage implements EmailMessage {

	private String text;
	private String addresses;
	private Map<String, String> msgFields;

	public InvitationEmailMessage(String text, String addresses, Map<String, String> msgFields) {
		super();
		this.text = text;
		this.addresses = addresses;
		this.msgFields = msgFields;
	}

	public String getText() {
		StrSubstitutor template = new StrSubstitutor(this.msgFields);
		return template.replace(text);
	}

	public String getSubject() {
		return "Arkect: Invitation Received!";
	}

	public String getFrom() {
		try {
			return EmailConfiguration.getInstance().getProperty("from");
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public String getAddresses() {
		return addresses;
	}

}
