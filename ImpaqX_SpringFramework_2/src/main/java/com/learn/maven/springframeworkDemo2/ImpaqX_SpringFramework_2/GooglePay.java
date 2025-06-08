package com.learn.maven.springframeworkDemo2.ImpaqX_SpringFramework_2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GooglePay implements UPI{

	@Override
	public void pay(int amount, int balance) {
		balance=balance-amount;
		System.out.println(amount+"Payed using googlepay");
		System.out.println("New Balance"+balance);
	}

	@Override
	public void history() {
		System.out.println("GooglePay History");
	}

}
