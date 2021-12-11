package com.gamblingsimulator;

public class GamblingSimulUC3 {
	public static void Gambler() {
		int stake = 100;
		int bet = 1;
		int numberOfBet = 0;
		while(stake != 50 && stake != 150) {
			double betCheck = Math.floor(Math.random() * 10) % 2;
			if(betCheck == 1) {
				stake += bet;
				System.out.println("Gambler won by :" +stake);	
			}else {
				stake -= bet;
				System.out.println("oops ! Gambler lost by :" +stake);
			}
			System.out.println("Value of stake is " +stake);
		}
		System.out.println("Gambler is resigning for the day");
		numberOfBet = numberOfBet + 1;
		System.out.println("He has bet " +numberOfBet+ " times." );	
	}
 public static void main(String[] args) {
	 Gambler();
 }
}

