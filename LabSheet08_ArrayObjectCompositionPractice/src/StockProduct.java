import java.util.*;
public class StockProduct {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Product[] productlist = new Product[4];
		for(int i=0; i<productlist.length;i++) {
			System.out.print("Input product Id : ");
			String productId = scan.nextLine();
			System.out.print("Input product Unit : ");
			int productUnit = scan.nextInt();
			System.out.print("Input product Price : ");
			int productPrice = scan.nextInt();
		}
		double totalPrice = 0;
	       System.out.println("----------------------------------------");
	       for (Product product : productlist) {
	           double productTotal = product.calculate();
	           totalPrice += productTotal;
	           System.out.println("Product ID: " + product.getId() + ", Total price = " + productTotal + " baht.");
	       }
	       System.out.println("----------------------------------------");
	       System.out.println("Total price of all products is " + totalPrice + " baht.");
		
		scan.close();
	}

}
