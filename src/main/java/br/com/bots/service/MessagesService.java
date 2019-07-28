package br.com.bots.service;

import java.util.List;

import br.com.bots.entity.Messages;

public interface MessagesService {
	
	public List<Messages> getConversationByConversationId(String conversationId);
    public Messages getConversationById(String conversationId); 
    public void saveConversation(Messages userConversation);

}
