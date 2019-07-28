package br.com.bots.entity;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MessagesTest {
	
	@Test
	public void ValidatingConversationFieldsOk() {
		
		Messages userConversation = new Messages();
		userConversation.setId("12345");
		userConversation.setConversationId("4444");
		userConversation.setTimestamp("01/01/1990");
		userConversation.setFromId("123456");
		userConversation.setToId("7890");
		userConversation.setText("teste");
		
		assertEquals(userConversation.getId(), "12345");
		assertEquals(userConversation.getConversationId(), "4444");
		assertEquals(userConversation.getTimestamp(), "01/01/1990");
		assertEquals(userConversation.getFromId(), "123456");
		assertEquals(userConversation.getToId(), "7890");
		assertEquals(userConversation.getText(), "teste");
	}
	
	@Test
	public void ValidatingConversationFieldsNOk() {
		
		Messages userConversation = new Messages();
		userConversation.setId("12345");
		userConversation.setConversationId("4444");
		userConversation.setTimestamp("01/01/1990");
		userConversation.setFromId("123456");
		userConversation.setToId("7890");
		userConversation.setText("teste");
	
	    assertNotEquals(userConversation.getId(), 12345);
	    assertNotEquals(userConversation.getConversationId(), 4444);
	    assertNotEquals(userConversation.getTimestamp(), 01/01/1990);
	    assertNotEquals(userConversation.getFromId(), 123456);
	    assertNotEquals(userConversation.getToId(), 7890);

	}
	

}
