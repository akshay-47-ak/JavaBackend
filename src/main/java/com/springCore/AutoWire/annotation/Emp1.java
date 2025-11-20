package com.springCore.AutoWire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp1 {
    
	@Autowired
	private Team team;
	
	private String name;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Emp1(String Name, Team team) {
		this.name= Name;
		this.team = team;
	}

	public Emp1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp1 [team=" + team + ", name=" + name + "]";
	}
	
	
	
	
}
