
/**
 * Assignment: Assignment7.
*Description:This program displays each employee number 
*and asks the user to enter that employee’s hours and pay rate
*Class: Fall - COSC 1437.81002
*Assignment7: 
*Date: 04/08/2024
*@author SUDIP PAUDEL
*@version 0.00
*/ 
import java.util.ArrayList;
import java.util.Scanner;
public class PayrollDriver {
    /**
     * The main method to execute the payroll program.
     * It prompts the user to enter hours worked and pay rate for each employee,
     * calculates the wages, and displays the payroll information.
     * @param args The command-line arguments (not used).
     */
    
    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        Scanner scanner = new Scanner(System.in);

        // Input employee hours and pay rates
        for (int i = 0; i < payroll.getEmployeeId().size(); i++) {
            System.out.println("Enter hours worked for employee with ID " + payroll.getEmployeeId().get(i) + ":");
            int hoursWorked = scanner.nextInt();
            payroll.setHours(i, hoursWorked);

            System.out.println("Enter pay rate for employee with ID " + payroll.getEmployeeId().get(i) + ":");
            double payRate = scanner.nextDouble();
            payroll.setPayRate(i, payRate);
        }

        // Calculate wages
        payroll.calculateWages();

        // Display payroll
        payroll.displayPayroll();

        scanner.close();
    }
}
