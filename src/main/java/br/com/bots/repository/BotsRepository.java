package br.com.bots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bots.entity.Bots;

@Repository
public interface BotsRepository extends JpaRepository<Bots, String>{
	

}
