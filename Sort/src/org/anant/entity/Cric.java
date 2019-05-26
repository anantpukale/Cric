package org.anant.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Cric {
	private Map<String, String> meta;
	private Info info;
	private ArrayList<Object>  innings;
	
	public ArrayList<Object> getInnings() {
		return innings;
	}
	public Map<String, String> getMeta() {
		return meta;
	}
	public Info getInfo() {
		return info;
	}
	
}
