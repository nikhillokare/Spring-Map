package com.bean;

import java.util.List;
import java.util.Map;

public class DID {
	
	private String seasonName;
	private List<String> brandpartner;
	private Map<Participants,String> participants;
	
	//Getters and Setters
	public String getSeasonName() {
		return seasonName;
	}
	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}
	public List<String> getBrandpartner() {
		return brandpartner;
	}
	public void setBrandpartner(List<String> brandpartner) {
		this.brandpartner = brandpartner;
	}
	public Map<Participants, String> getParticipants() {
		return participants;
	}
	public void setParticipants(Map<Participants, String> participants) {
		this.participants = participants;
	}
	
	public void display() {
		System.out.println("DID seasonName=" + seasonName + ", brandpartner=" + brandpartner + ", participants=" + participants);
	}
	
	
	

}
