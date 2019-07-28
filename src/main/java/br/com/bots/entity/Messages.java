package br.com.bots.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity 
public class Messages {
	
	@Id
	private String id;
	private String conversationId;
	private String timestamp;
	@JsonProperty("from")
	private String fromId;
	@JsonProperty("to")
	private String toId;
	private String text;
	
	public Messages( String id
						   , String conversationId	
						   , String timestamp
						   , String fromId
						   , String toId
						   , String text) {
		
		this.id = id;
		this.conversationId = conversationId;
	    this.timestamp = timestamp;
	    this.fromId = fromId;
	    this.toId = toId;
	    this.text = text;
	}
	
	public Messages() {
		
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getConversationId() {
		return this.conversationId;
	}
	
	public void setConversationId(String conversationId ) {
		this.conversationId = conversationId;
	}
	
	public String getTimestamp() {
		return this.timestamp;
	}
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getFromId() {
		return this.fromId;
		
	}
	
	public void setFromId(String fromId) {
		this.fromId = fromId;
	}
	
	public String getToId() {
		return this.toId;
		
	}
	
	public void setToId(String toId) {
		this.toId = toId;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

}
