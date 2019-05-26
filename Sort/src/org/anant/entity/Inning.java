package org.anant.entity;

import java.util.ArrayList;

public class Inning {
	private String team;
	public String getTeam() {
		return team;
	}
	public ArrayList<Delivery> getDeliveries() {
		return deliveries;
	}
	private ArrayList<Delivery> deliveries;
}
