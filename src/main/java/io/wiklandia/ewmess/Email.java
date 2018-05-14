package io.wiklandia.ewmess;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Email {

	private String to;
	private String body;

}
