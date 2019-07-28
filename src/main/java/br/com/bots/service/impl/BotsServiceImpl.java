package br.com.bots.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bots.entity.Bots;
import br.com.bots.repository.BotsRepository;
import br.com.bots.service.BotsService;

@Service
public class BotsServiceImpl implements BotsService{
	
	@Autowired
	BotsRepository botsRepository;
	

	public Bots getUser(String id) {
	
			return botsRepository.findOne(id);
		
	}

	public void saveUser(Bots user) {
		
		if (user.getId().equals(null))
			user.setId(UUID.randomUUID().toString());
		
		botsRepository.save(user);
	}


	public void deleteUser(Bots user) {
		botsRepository.delete(user);
		
	}


}
