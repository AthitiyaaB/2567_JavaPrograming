import javax.swing.*;
public class JavaaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name: ");
		
		String productUnitSir = JOptionPane.showInputDialog("Input Product Unit: ");
		int productUnit = Integer.parseInt(productUnitSir);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Pricce per unit "));
		
		double totalPrice = productPrice * productUnit;
		double totalVat = totalPrice +(totalPrice*7/100);
		
		String frmTotalPrice = String.format("%,.2f", totalPrice);
		String frmTotalVat = String.format("%,.2f",totalVat);
		
		JOptionPane.showMessageDialog(null, "Total Price is "+ totalPrice + "Baht."
		+ "\nAdd VAT 7% is "+ frmTotalVat+" baht");

	}

}
