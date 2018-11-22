package com.bottype.mavenapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bottype.mavenapp.bean.Game;
import com.bottype.mavenapp.repository.GameRepository;


@Service
public class GameService {
	
	private GameRepository gameRepository;

	@Autowired
	public void setGameRepository(GameRepository gameRepository) {
		this.gameRepository = gameRepository;
	}

	@Transactional
	public List<Game> getGames() {

		return (List<Game>) gameRepository.findAll();

	}


}
