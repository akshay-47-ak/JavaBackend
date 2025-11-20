package com.springCore.AutoWire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Team {

  private String name;

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public Team( ) {
	super();
	// TODO Auto-generated constructor stub
  }

  @Override
  public String toString() {
	return "Team [name=" + name + "]";
  }
    
	
}
