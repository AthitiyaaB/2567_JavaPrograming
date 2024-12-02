package labsheet02;
import javax.swing.*;
import java.text.*;
public class labsheet201 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int BUFFER = 299;
		double discount;
		int isMember;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill?"));
		
		double totalPrice = numberofCustomer * BUFFER;
		
		do {
			isMember = JOptionPane.showConfirmDialog(null,
				"Total Price is "+ totalPrice + " baht."+
		        "\nDo you have a member card?");
		}while(isMember==2);
		if(isMember==0) {
			discount = totalPrice *0.09;
			JOptionPane.showConfirmDialog(null, "Amount to be paid is"+ discount + " baht.");
		}
		else if(isMember==1) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+ frm.format(totalPrice)+ " baht.");
		}

	}

}
