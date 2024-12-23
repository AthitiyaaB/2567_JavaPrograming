import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; 
		 final double BASE_SALARY = 1000.0;
		 
		 int sales; 
		 double salary; 
		 
		 Scanner input = new Scanner(System.in);
		 
		 while(true) {
			 System.out.print("Enter gross sales for the salesperson(or -1 to end): ");
			 sales = input.nextInt();
			 
			 if (sales == SENTINEL) {
				break;
			}
			 
			 salary = BASE_SALARY + (sales * COMMISSION_RATE);
			 
			 System.out.printf("The salesperson's is $%,.2f", salary);
			 System.out.println();
		 }
		 System.out.println("bye.");
		 System.out.println("All salesperson's salaries have been computed.");
	}

}