package com.springCore.AutoWire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp1 {
    

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
	@Autowired
	public Emp1(@Qualifier("team1") Team team) {
		super();
		this.team = team;
	}



	@Override
	public String toString() {
		return "Emp1 [team=" + team + ", name=" + name + "]";
	}
	
	
	
	
}
