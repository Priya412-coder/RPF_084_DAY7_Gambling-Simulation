package com.gamblingsimulator;

public class GamblingSimulUC4 {
	public static void Gambler() {
		int stake = 100;
		int won = 0;
		int lost = 0;
		for(int days = 1; days <= 20; days++) {
			double betCheck = Math.floor(Math.random() * 10) % 2;
			if(betCheck == 1) {
				won++;
			}else {
				lost++;
			}
		}
		System.out.println("Total amount of win in 20 days is " +won);	
		System.out.println("Total amount of lost in 20 days is " +lost);
	}

	public static void main(String[] args) {
		Gambler();
	}
}


