package com.learn.maven.springframeworkDemo2.ImpaqX_SpringFramework_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Paytm implements UPI {

	@Override
	public void pay(int amout, int balance) {
		balance=balance-amout;
		System.out.println(amout+"Payed using Paytm");
		System.out.println("New Balance"+balance);
	}

	@Override
	public void history() {
	System.out.println("Paytm History");
	}

}
