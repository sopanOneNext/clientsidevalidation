package com.phonon.bank;

import java.util.ArrayList;

public class TestRateOfInterest {
	public static void main(String[] args) {
		ArrayList<Bank> bankList = new ArrayList<Bank>();
		SBI getIntSB= new SBI();
		PNB getIntPB= new PNB();
		bankList.add(getIntSB);
		bankList.add(getIntPB);
		System.out.println("SBI Interest rate "+getIntSB.getRateOfInterest());
		System.out.println("PNB Interest rate "+getIntPB.getRateOfInterest());	
		
		
		
		}

}
