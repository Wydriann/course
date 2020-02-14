package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.Worker;
import entities.enums.WorkerLevel;
public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enther the departame's name: ");
		String departamentName = input.nextLine();
		
		System.out.println("Enther the Work Data: ");
		System.out.print("Name: ");
		String workerName = input.nextLine();
		
		System.out.println("Level: ");
		String workerLevel = input.nextLine();
		
		System.out.println("Base Salary: ");
		double baseSalary = input.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));
		
		System.out.print("How many constracts to this Worker? ");
		int n = input.nextInt();
		
		for (int i = 1; i < n; i++) {
			System.out.print("Enter contract #" + i + "Data: ");
			
			System.out.print("Date (DD/MM/YY): ");
			Date contractDate = sdf.parse(input.next());
			
			System.out.print("Value per hour: ");
			double valuePerHour = input.nextDouble();
			
			System.out.println("Duration (Hours): ");
			int hours = input.nextInt();
			
			
		}
		
		
		
		
		
		
		
		input.close();
	}

}
