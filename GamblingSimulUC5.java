package com.gamblingsimulator;

public class GamblingSimulUC5 {
	public static void Gambler() {
		int[] month = { 31 ,28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 };
		//String[] month = { "jan" , "feb" , "mar" , "apr" , "may" , "jun" , "july" , "aug" , "sept" , "oct" , "nov" , "dec" } ;
		int stake = 100;
		int bet = 1;
		int won = 0;
		int lost = 0;
		int totalLost = 0;
		int totalWin = 0;
		for (int i = 0 ; i <= month.length; i++) {
			while(stake != 50 && stake != 150) {
			double betCheck = Math.floor(Math.random() * 10) % 2;
			if(betCheck == 1) {
				stake += bet;
				won = stake + 100;
			}else {
				stake -= bet;
				lost = stake - 100;
			}
		System.out.println("Total amount of win in each month is " +won);	
		System.out.println("Total amount of lost in each days is " +lost);
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
