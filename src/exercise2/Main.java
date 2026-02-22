package exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercise2.entities.LegalPerson;
import exercise2.entities.NaturalPerson;
import exercise2.entities.Taxpayer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tax payers: ");
		List<Taxpayer> taxPayers = new ArrayList<>();
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Tax payer #%d data: \n", i + 1);
			System.out.println("Indiviual or Company (i/c)? ");
			char payerType = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Annual Income: ");
			double annualIncome = sc.nextDouble();
			
			if(payerType == 'c') {
				System.out.println("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				LegalPerson p = new LegalPerson(name, annualIncome, numberOfEmployees);
				taxPayers.add(p);
			}
			else {
				System.out.println("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				NaturalPerson p = new NaturalPerson(name, annualIncome, healthExpenditures);
				taxPayers.add(p);
			}
		}
		System.out.println("TAXES PAID: ");
		double total = 0;
		for (Taxpayer taxpayer : taxPayers) {
			System.out.println(taxpayer +"\n");
			total += taxpayer.calculateTax();	
		}
		System.out.println("TOTAL TAXES: " + total);

	}

}
