package br.com.bots.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class BotsTest {
	
	@Test
	public void ValidatingUserFieldsOk() {
		
		Bots user = new Bots();
		user.setId("12345");
		user.setName("teste");
		
		assertEquals(user.getId(), "12345");
		assertEquals(user.getName(), "teste");
	}
	
	@Test
	public void ValidatingUserFieldsNOk() {
		
		Bots user = new Bots();
		user.setId("12345");
		
		assertNotEquals(user.getId(), 12345);

	}

}
