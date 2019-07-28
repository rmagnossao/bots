package br.com.bots.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bots.entity.Messages;
import br.com.bots.repository.MessagesRepository;
import br.com.bots.service.MessagesService;

@Service
public class MessagesServiceImpl implements MessagesService{
	
	@Autowired
	MessagesRepository conversationRepository;

	public List<Messages> getConversationByConversationId(String conversationId) {
		
		return conversationRepository.findByConversationId(conversationId);
	}

	public Messages getConversationById(String id) {
		
		return conversationRepository.findOne(id);
	}

	public void saveConversation(Messages usarConversation) {
		
		conversationRepository.save(usarConversation);
		
	}

}
