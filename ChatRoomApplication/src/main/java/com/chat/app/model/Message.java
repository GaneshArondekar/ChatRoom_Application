package com.chat.app.model;

public class Message {
	private String name;
	private String content;

	public Message(String name, String content) {
	super();
	 	this.content = content;
	 	this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


}
