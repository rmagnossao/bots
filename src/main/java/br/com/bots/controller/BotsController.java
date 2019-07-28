package br.com.bots.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bots.entity.Bots;
import br.com.bots.service.BotsService;

@RestController
public class BotsController {
	
	@Autowired
	BotsService botsService;
	

	@RequestMapping(value="/bots/{id}", method=RequestMethod.GET)
	public Bots getUser (@PathVariable(value="id") String id) {
		
		return 	botsService.getUser(id);
				
	}
	
	@RequestMapping(value="/bots", method=RequestMethod.POST)
	@ResponseBody()
	public void saveUser (@RequestBody Bots payload) {
	
		botsService.saveUser(payload);

	}
	
	@RequestMapping(value="/bots", method=RequestMethod.DELETE)
	public void getBotMessage (@RequestBody Bots payload) {
		botsService.deleteUser(payload);
	}
	
	

}
