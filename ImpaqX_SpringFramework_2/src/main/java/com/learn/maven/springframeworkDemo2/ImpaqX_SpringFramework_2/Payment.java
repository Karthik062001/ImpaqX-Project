package com.learn.maven.springframeworkDemo2.ImpaqX_SpringFramework_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Payment {

	@Autowired
	@Qualifier("Paytm")
	UPI upi;

	public UPI getUpi() {
		return upi;
	}

	public void setUpi(UPI upi) {
		this.upi = upi;
	}
	
	public void pay()
	{
		System.out.println("pay");
		upi.pay(100, 10000);
		upi.history();
	}
}
