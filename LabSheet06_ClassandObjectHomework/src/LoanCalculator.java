public class LoanCalculator {
	private String productName;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String pdName, double pdprice, double pdinterestRate, int pdyears) {
		productName = pdName;
		price = pdprice;
		interestRate = pdinterestRate;
		years = pdyears;
	}
	
	public double calculateMonthlyPayment() {
		double monthlyRate = interestRate/100/12;
		int months = years*12;
		return (price * monthlyRate * Math.pow(1 +  monthlyRate, months)) /
				(Math.pow(1 + monthlyRate, months)-1);
	} 
	
	public void displayLoanDetails() {
		System.out.println("Product: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Interest Rate: " + interestRate + "%");
		System.out.println("Loan Period: " + years + " years");
		System.out.printf("Monthly Payment: %.2f\n", calculateMonthlyPayment());
	}
}
