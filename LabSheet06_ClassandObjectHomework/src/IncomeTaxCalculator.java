public class IncomeTaxCalculator {
	
   private double income; 
   
   public void setIncome(double newIncome) {
       income = newIncome;
   }
  
   public void displayTaxDetails() {
       System.out.println("Income: " + income);
       System.out.println("Tax: " + calculateTax());
   }
   
   public double calculateTax() {
	   double tax = 0.0;
	   double taxAmount = 0.0;
	   
       if (income > 150000) {
    	   tax = Math.min(income - 150000, 150000);
    	   taxAmount += tax * 0.05;
       }
       
       if (income > 300000) {
    	   tax = Math.min(income - 300000, 200000); 
    	   taxAmount += tax * 0.10;

       }

       if (income > 500000) {
    	   tax = income - 500000; 
    	   taxAmount += tax * 0.20;
       }
       
       
	   	return taxAmount;
   }
  
}