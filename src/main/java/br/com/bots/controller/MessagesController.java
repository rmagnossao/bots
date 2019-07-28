package br.com.bots.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.bots.entity.Messages;
import br.com.bots.service.MessagesService;

@RestController
public class MessagesController {
	
	@Autowired 
	MessagesService conversationService;
	
	@RequestMapping(value="/message", method = RequestMethod.POST)
	public void saveMessage (@RequestBody Messages userConversation) {
		
		
		userConversation.setId(UUID.randomUUID().toString());
		conversationService.saveConversation(userConversation);
		
	}
	
	@RequestMapping(value="/message", method = RequestMethod.GET)
	public List<Messages> getConversations (@RequestParam String conversationId  ){
		
		return conversationService.getConversationByConversationId(conversationId);
		
	}
	
	@RequestMapping(value="/message/{id}", method=RequestMethod.GET)
	public Messages getConversationById (@PathVariable String id) {
		
		return conversationService.getConversationById(id);
		
	}
	

}
