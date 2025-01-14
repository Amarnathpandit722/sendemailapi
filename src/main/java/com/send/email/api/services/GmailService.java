package com.send.email.api.services;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.Base64;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.GmailScopes;
import com.google.api.services.gmail.model.Message;

import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class GmailService {
	
	/*
	 * @Value("${google.service.account.key}") private String serviceAccountKeyFile;
	 * 
	 * private static final String APPLICATION_NAME = "My Project 1675"; private
	 * static final String SERVICE_ACCOUNT_KEY_FILE =
	 * "path-to-service-account-key.json"; private static final String USER_EMAIL =
	 * "aaushmannkumar189@gmail.com"; private static final String GMAIL_SEND =
	 * "https://www.googleapis.com/auth/gmail.send";
	 * 
	 * public void sendEmail(String to, String subject, String body) throws
	 * Exception { // Authenticate using service account Credential credential =
	 * GoogleCredential.fromStream(new FileInputStream(serviceAccountKeyFile))
	 * .createScoped(Collections.singleton(GmailScopes.GMAIL_SEND));
	 * 
	 * Gmail service = new Gmail.Builder(credential.getTransport(),
	 * credential.getJsonFactory(), credential)
	 * .setApplicationName(APPLICATION_NAME) .build();
	 * 
	 * // Create email message MimeMessage mimeMessage = createEmail(to, USER_EMAIL,
	 * subject, body);
	 * 
	 * // Encode and send the message Message message =
	 * createMessageWithEmail(mimeMessage);
	 * 
	 * try { service.users().messages().send("me", message).execute(); } catch
	 * (GoogleJsonResponseException e) { System.err.println("Error details: " +
	 * e.getDetails()); }
	 * 
	 * }
	 * 
	 * private MimeMessage createEmail(String to, String from, String subject,
	 * String bodyText) throws MessagingException { Session session =
	 * Session.getDefaultInstance(System.getProperties(), null); MimeMessage email =
	 * new MimeMessage(session);
	 * 
	 * email.setFrom(new InternetAddress(from));
	 * email.addRecipient(jakarta.mail.Message.RecipientType.TO, new
	 * InternetAddress(to)); email.setSubject(subject); email.setText(bodyText);
	 * 
	 * return email; }
	 * 
	 * private Message createMessageWithEmail(MimeMessage emailContent) throws
	 * Exception { ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	 * emailContent.writeTo(buffer); byte[] rawBytes = buffer.toByteArray(); String
	 * encodedEmail = Base64.getUrlEncoder().encodeToString(rawBytes);
	 * 
	 * Message message = new Message(); message.setRaw(encodedEmail);
	 * 
	 * return message; }
	 */
}
