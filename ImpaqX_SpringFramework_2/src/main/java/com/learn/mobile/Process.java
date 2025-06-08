package com.learn.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Process {

	@Autowired
	@Qualifier("Apple")
	Mobile mob;

	public Mobile getMob() {
		return mob;
	}

	public void setMob(Mobile mob) {
		this.mob = mob;
	}
	
	public void run()
	{
		System.out.println("Mobile");
		mob.processor();
	}
}
