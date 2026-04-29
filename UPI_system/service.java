package UPI_system;

import java.util.Scanner;

public class service {

	dao d = null;

	public service() {
		d = new dao();
	}

	public void withdraw() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the amount to deposit: ");
		double amount = sc.nextDouble();

		boolean result = d.withdraw(accountNumber, amount);
		if (result) {
			System.out.println("Withdraw Successfulll!!!!");
		} else

		{
			System.err.println("failed!!!");
		}

	}

	public void deposit() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter you sender account number: ");
		int senderacc=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the receiver account number: ");
		int receiveracc = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the amount to deposited: ");
		double amount = sc.nextDouble();

		boolean deposited = d.deposit(receiveracc, amount, senderacc);
		if (deposited) {
			System.out.println("Deposited Successfully!!!!");
		} else {
			System.err.println("Transaction failed!!!!");
		}

	}

}
