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

import br.com.bots.entity.Bots;
import br.com.bots.entity.Messages;
import br.com.bots.repository.BotsRepository;
import br.com.bots.service.BotsService;



@RunWith(MockitoJUnitRunner.class)
public class BotsServiceImplTest {
	
	@Mock
	BotsRepository userRepository;
	
	@Mock
	BotsService userService;
	
	@Test
	public void saveUserTest() {
		
		Bots user = new Bots();
		user.setId("12345");
		user.setName("teste");
		
		Mockito.doThrow(SQLException.class)
		.when(userService)
		.saveUser(user);

	}
	
	@Test
	public void getUserById() {
		
		Bots user = new Bots();
		user.setId("12345");
		user.setName("teste");
		
		Mockito.when(userService.getUser("4444"))
		.thenReturn(user);
		
		Bots userResp  = userService.getUser("4444");
		assertEquals(user.getId(), userResp.getId());
		
		
	}
	
	@Test
	public void deleteUserTest() {
		
		Bots user = new Bots();
		user.setId("12345");
		user.setName("teste");
		
		Mockito.doThrow(SQLException.class)
		.when(userService)
		.deleteUser((user));

	}
	

}
