package io.wiklandia.ewmess;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Receiver {

	@JmsListener(destination = "mailbox")
	public void receiveMessage(Email email) {
		log.info("Received: {}", email);
	}

}