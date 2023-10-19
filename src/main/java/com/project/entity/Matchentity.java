package com.project.entity;

import jakarta.persistence.Entity;

@Entity
public class Matchentity {

	private int matchId;
	private String matchName;
	private String teamA;
	private String teamB;
	private int overs;
	private int wickets;
	
	
	public Matchentity() {
		
	}
	
	


	public Matchentity(int matchId, String matchName, String teamA, String teamB, int overs, int wickets) {
		super();
		this.matchId = matchId;
		this.matchName = matchName;
		this.teamA = teamA;
		this.teamB = teamB;
		this.overs = overs;
		this.wickets = wickets;
	}




	public int getMatchId() {
		return matchId;
	}


	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}


	public String getMatchName() {
		return matchName;
	}


	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}


	public String getTeamA() {
		return teamA;
	}


	public void setTeamA(String teamA) {
		this.teamA = teamA;
	}


	public String getTeamB() {
		return teamB;
	}


	public void setTeamB(String teamB) {
		this.teamB = teamB;
	}


	public int getOvers() {
		return overs;
	}


	public void setOvers(int overs) {
		this.overs = overs;
	}


	public int getWickets() {
		return wickets;
	}


	public void setWickets(int wickets) {
		this.wickets = wickets;
	}




	@Override
	public String toString() {
		return "Matchentity [matchId=" + matchId + ", matchName=" + matchName + ", teamA=" + teamA + ", teamB=" + teamB
				+ ", overs=" + overs + ", wickets=" + wickets + "]";
	}
	
	
}
