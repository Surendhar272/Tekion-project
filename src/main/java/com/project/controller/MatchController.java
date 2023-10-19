package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Matchentity;
import com.project.service.PlayGameService;

@RestController
@RequestMapping("/match")
public class MatchController {

	@Autowired
	private PlayGameService play;
	

	@PostMapping("/test")
    public Matchentity testMatch(@RequestBody Matchentity match) {
		return match;
    }  
	 
	
   @PostMapping("/start-match")
   public String simulateMatch(@RequestBody Matchentity match) {
      int runsTeamA = play.simulateTeamScore(match.getOvers(),match.getWickets());
      int runsTeamB = play.simulateTeamScore(match.getOvers(),match.getWickets());
      
      String result = play.determineWinner(runsTeamA, runsTeamB, match.getTeamA(), match.getTeamB());
      
      System.out.println(result);
      return result;
  }

	
	
}
