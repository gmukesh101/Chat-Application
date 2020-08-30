package com.mukesh.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chatMessages")
public class ChatMessage {
	@Id
	private MessageType type;
	private String content;
	private String sender;
//	private String topic;
	
	/*
	 * private long id;
	 * 
	 * private String fromV; private String messageV; private Timestamp time;
	 */

	public enum MessageType {
		CHAT, JOIN, LEAVE
	}
}
