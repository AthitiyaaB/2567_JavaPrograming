package labsheet02;

import java.util.*;

public class SalespersonSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare constants
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 final double BASE_SALARY = 10000.0;
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		 
		 Scanner input = new Scanner(System.in);
		 
		 while(true) {
			 System.out.print("Enter qross sales for the salesperson (or -1 to end : ");
			 sales = input.nextInt();
			 
			 if(sales==SENTINEL) {
				 break;
			 }
			 salary = BASE_SALARY + (sales * COMMISSION_RATE);
			 System.out.printf("The salesperson's salary is $%, .2f", salary);
			 System.out.println();
		 }
		 System.out.println("bye. ");
		 System.out.println("All salesperson's salaries have been computed.");
	}

}
