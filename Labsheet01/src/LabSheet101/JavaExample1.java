import java.util.*;
import java.text.*;
public class JavaExample1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input proxuct name: ");
		String productName = scan.nextLine();
		
		System.out.print("Input product unit: ");
		int productUnit = scan.nextInt();
		
		System.out.print("input price per unit: ");
		float productPrice = scan.nextFloat();
		
		System.out.println();
		System.out.println("'Product name is : "+ productName);
		
		float totalPriceProduct = productUnit * productPrice;
		System.out.println("Total Price is "+ frm.format(totalPriceProduct)+" baht.");
		
		float totalVat = totalPriceProduct +(totalPriceProduct * 7/100);
		System.out.println("Add Vat 7% is "+ frm.format(totalVat)+" baht.");
		
		System.out.println("*****using print and  String.fprmat********");
		System.out.printf("Product name is : %s", productName);
		System.out.printf("total price is %,.2f",totalPriceProduct);
		System.out.printf("\nAdd VAT 7% % is %s baht.",String.format("%,.2f",totalVat));

	}

}
