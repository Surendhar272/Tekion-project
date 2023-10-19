package com.project.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class PlayGameService {
	
	public int simulateTeamScore(int overs, int wickets) {
		Random random = new Random();

      
      int runs=0,balls=overs*6,players=wickets;
      
      
      while (balls>0 && players>0) {
      	 int randomruns = random.nextInt(8);
      	 if(randomruns==7) {
      		 players--;
      	 }else {
      		 runs=randomruns+runs;
      	 }   	 
      	 balls--;
      }

      return runs;
  }
	
	
	public String determineWinner(int runsTeamA, int runsTeamB, String team_A, String team_B) {
      if (runsTeamA > runsTeamB) {
          return team_A + " wins the match!";
      } else if (runsTeamB > runsTeamA) {
          return team_B + " wins the match!";
      } else {
          return "It's a tie!";
      }
	}

}
