package com.gamblingsimulator;

public class GamblingSimulUC4 {
	public static void Gambler() {
		int stake = 100;
		int bet = 1;
		int won = 0;
		int lost = 0;
		int totalWin = 0;
		int totalLost = 0;
		for(int days = 1; days <= 20; days++) {
			while(stake != 50 && stake != 150) {
			double betCheck = Math.floor(Math.random() * 10) % 2;
			if(betCheck == 1) {
				stake += bet;
				won = stake + 100;
			}else {
				stake -= bet;
				lost = stake - 100;
			}
		System.out.println("Total amount of win in 20 days is " +won);	
		System.out.println("Total amount of lost in 20 days is " +lost);
		}
		}
		 totalWin = totalWin + won;
		 totalLost = totalLost + lost;
	System.out.println("Total win for 20 days is: " + totalWin + "$");
	System.out.println("Total lost for 20 days is: " + totalLost + "$");
	}
	public static void main(String[] args) {
		Gambler();
	}
}


