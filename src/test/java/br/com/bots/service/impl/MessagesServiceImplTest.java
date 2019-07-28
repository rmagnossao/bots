package br.com.bots.service.impl;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.bots.entity.Messages;
import br.com.bots.repository.MessagesRepository;
import br.com.bots.service.MessagesService;



@RunWith(MockitoJUnitRunner.class)
public class MessagesServiceImplTest {
	
	@Mock
	MessagesRepository conversationRepository;
	
	@Mock
	MessagesService conversationService;
	
	@Test
	public void saveConversationTest() {
		
		Messages userConversation = new Messages();
		userConversation.setId("12345");
		userConversation.setConversationId("4444");
		userConversation.setTimestamp("01/01/1990");
		userConversation.setFromId("123456");
		userConversation.setToId("7890");
		userConversation.setText("teste");
		
		Mockito.doThrow(SQLException.class)
		.when(conversationService)
		.saveConversation(userConversation);

	}
	
	@Test
	public void getConversationsByConversationId() {
		
		List<Messages> listConversation = new ArrayList<Messages>();
		
		Messages userConversation1 = new Messages();
		userConversation1.setId("12345");
		userConversation1.setConversationId("4444");
		userConversation1.setTimestamp("01/01/1990");
		userConversation1.setFromId("123456");
		userConversation1.setToId("7890");
		userConversation1.setText("teste");
		
		listConversation.add(userConversation1);
		
		Messages userConversation2 = new Messages();
		userConversation2.setId("12345");
		userConversation2.setConversationId("4444");
		userConversation2.setTimestamp("01/01/1990");
		userConversation2.setFromId("123456");
		userConversation2.setToId("7890");
		userConversation2.setText("teste2");
		
		listConversation.add(userConversation2);
		
		Mockito.when(conversationService.getConversationByConversationId("4444"))
		.thenReturn(listConversation);
		
		List<Messages> listConversationResult = 
				conversationService.getConversationByConversationId("4444");
		
		assertEquals(listConversationResult.get(0).getConversationId(), userConversation1.getConversationId());
		
		
	}
	
	
	@Test
	public void getConversationsById() {
		
		Messages userConversation = new Messages();
		userConversation.setId("12345");
		userConversation.setConversationId("4444");
		userConversation.setTimestamp("01/01/1990");
		userConversation.setFromId("123456");
		userConversation.setToId("7890");
		userConversation.setText("teste");
		
		Mockito.when(conversationService.getConversationById("4444"))
		.thenReturn(userConversation);
		
		Messages userConversationResp = 
				conversationService.getConversationById("4444");
		
		assertEquals(userConversationResp.getId(), userConversation.getId());
		
		
	}
	

}
