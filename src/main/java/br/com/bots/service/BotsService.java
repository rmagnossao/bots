package br.com.bots.service;

import br.com.bots.entity.Bots;

public interface BotsService {
	
	public Bots getUser(String id);
    public void saveUser(Bots user);
    public void deleteUser(Bots user);
}
