package org.anant.entity;

import java.util.List;
import java.util.Map;

public class Info {
	private String  city;
	private String[] dates;
	private String gender;
	private String match_type;
	private Outcome outcome;
	private String overs;
	private String[] player_of_match;
	private String[] teams;
	private Map<String,String> toss;
	private String[] umpires;
	private String venue;	
	
	public String getCity() {
		return city;
	}
	public String[] getDates() {
		return dates;
	}
	
	public String getGender() {
		return gender;
	}
	public String getMatch_type() {
		return match_type;
	}
	public Outcome getoutcome() {
		return outcome;
	}
	public String getOvers() {
		return overs;
	}
	public String[] getplayer_of_match() {
		return player_of_match;
	}
	public String[] getTeams() {
		return teams;
	}
	public Map<String,String> getToss() {
		return toss;
	}
	public String[] getUmpires() {
		return umpires;
	}
	public String getVenue() {
		return venue;
	}
	
}
