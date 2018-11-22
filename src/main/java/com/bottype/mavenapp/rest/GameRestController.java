package com.bottype.mavenapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bottype.mavenapp.bean.Game;
import com.bottype.mavenapp.service.GameService;

@RestController
@RequestMapping("/rest/game")
public class GameRestController {
	private GameService gameService;

	@Autowired
	public void setGameService(GameService gameService) {

		this.gameService = gameService;
	}

	
	
	
	@GetMapping("/show")
	public List<Game> showGame (){
		List<Game> games = gameService.getGames();
		
		System.out.println(games);
		return games;
		
	
	}


}
