package br.com.bots.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bots.entity.Messages;

public interface MessagesRepository extends JpaRepository<Messages, String> {
     
	public List<Messages> findByConversationId(String conversationId);

}
