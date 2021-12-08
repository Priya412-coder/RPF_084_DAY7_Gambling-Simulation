package com.gamblingsimulator;

public class GamblingSimulUC3 {
	public static void Gambler() {
		int stake = 100;
		for(int i = 1; i <= 50; i++) {
			double betCheck = Math.floor(Math.random() * 10) % 2;
			if(betCheck == 1) {
				System.out.println("Gambler won !");	
			}else {
				System.out.println("oops ! Gambler lost");
			}
		}
		System.out.println("Gambler is resigning for the day");
	}

 public static void main(String[] args) {
	 Gambler();
 }
}

