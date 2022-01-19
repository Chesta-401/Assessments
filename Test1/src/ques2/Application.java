package ques2;
import java.util.Random;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter D.O.B(DD/MM/YYYY): ");
		String[] dateOfBirth = sc.nextLine().split("/");
		Date date = new Date(Integer.parseInt(dateOfBirth[0]),Integer.parseInt(dateOfBirth[1]),Integer.parseInt(dateOfBirth[2]));
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter NIC: ");
		String nic = sc.nextLine();
		
		Owner owner = new Owner(name,date,nic);
		
		System.out.println("Enter balance: ");
		float balance = sc.nextFloat();
		
		Random rand = new Random();
		String number ="" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+ 
		rand.nextInt(10)+ rand.nextInt(10);
		
		Account account;
		
		System.out.println("Select account type: \n1. Savings \n2. Current");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			account = new SavingAccount(owner, balance, number, 40);
			account.print();
			break;
		case 2:
			account = new CurrentAccount(owner, balance, number, 8800);
			account.print();
			break;
		default:
			
			System.out.println("Invalid input!");
		}
		
		
	}


	}


