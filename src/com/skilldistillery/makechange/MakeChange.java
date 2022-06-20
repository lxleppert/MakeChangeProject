package com.skilldistillery.makechange;

public class MakeChange {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);

		double itemAmount;
		double tenderedAmount;
		double changeAmount;
		
		int dollarAmount;
		int centAmount;

		System.out.println("Enter Item Price: ");
		itemAmount = sc.nextDouble();

		if (itemAmount < .01) {
			System.err.println("Invalid Item Price");
			
		} else if (itemAmount >= 100000) {
			System.err.println("No Item Prices That High");
			
		} else {
			System.out.println("Enter Amount Tendered by Customer: ");
			tenderedAmount = sc.nextDouble();

			if (tenderedAmount < itemAmount) {
				System.err.println("Amount Tendered by Customer Lower than Item Price");
				
			} else {
				System.out.printf("\nItem Amount     : $  %9.2f%n", itemAmount);
				System.out.printf("Tendered Amount : $  %9.2f%n", tenderedAmount);

				changeAmount = tenderedAmount - itemAmount;
				
				System.out.println("                  ------------");
				System.out.printf("Change Amount   : $  %9.2f%n", changeAmount);

				dollarAmount = (int) changeAmount;
				
				if (changeAmount == 0) {
					System.out.println("\n*-----------------------------*");
					System.out.println("*     Exact Amount Given      *");
					System.out.println("*     No Change Necessary     *");
					System.out.println("*-----------------------------*");
				}

				if (dollarAmount == 0) {
					centAmount = (int) ((changeAmount + .005) * 100);
					
				} else {
					centAmount = (int) (((changeAmount + .005) % dollarAmount) * 100);
				}
				
				if ((dollarAmount != 0) || (centAmount != 0)) {
					System.out.println("\n*-----------------------------*");
					System.out.println("*  Give the following change  *");
					System.out.println("*-----------------------------*");

					if (dollarAmount != 0) {
						System.out.println("| Bills:                      |");
						dollarAmount -= calcChange(dollarAmount, 20, "$ 20");
						dollarAmount -= calcChange(dollarAmount, 10, "$ 10");
						dollarAmount -= calcChange(dollarAmount, 5, "$ 5");
						dollarAmount -= calcChange(dollarAmount, 1, "$ 1");
					}

					if (centAmount != 0) {
						System.out.println("| Coins:                      |");
						centAmount -= calcChange(centAmount, 25, "Quarter");
						centAmount -= calcChange(centAmount, 10, "Dime");
						centAmount -= calcChange(centAmount, 5, "Nickel");
						centAmount -= calcChange(centAmount, 1, "Penny");
					}
					System.out.println("*-----------------------------*");
				}
			}
		}
		sc.close();
	}

	public static int calcChange(int amount, int denomination, String changeType) {

		int denominationCount = 0;

		if (amount >= denomination) {
			
			denominationCount = amount / denomination;
			
			if (denominationCount > 1) {
				if (changeType.equals("Quarter")) {
					changeType = "Quarters";
					
				} else if (changeType.equals("Dime")) {
					changeType = "Dimes";
					
				} else if (changeType.equals("Penny")) {
					changeType = "Pennies";
				}
			}
			System.out.printf("| %13s :   %d         |\n", changeType, denominationCount);
		}
		return denominationCount * denomination;
	}
}