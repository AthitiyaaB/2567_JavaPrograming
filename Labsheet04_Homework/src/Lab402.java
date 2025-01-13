import javax.swing.*;
public class Lab402 {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year:"));
        while (!checkYear(year)) {
            year = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid year. Please input a year between 1000 and 3000."));
        }
        if (isLeapYear(year)) {
            JOptionPane.showMessageDialog(null, year + " is leap year.");
        } else {
            JOptionPane.showMessageDialog(null, year + " is NOT leap year.");
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean checkYear(int year) {
        return year >= 1000 && year <= 3000;
    }
}