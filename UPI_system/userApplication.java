package UPI_system;

import java.util.Scanner;

public class userApplication {

	public static void main(String[] args) {

		Controller c = new Controller();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("------UPI Menu-------");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("Enter your Choice: ");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				c.withdraw();
				break;
			case 2:
				c.deposit();
				break;
			case 3:
				System.out.println("Thanks for trusting us!!!!");
				System.exit(0);

			}

		}
	}

}
