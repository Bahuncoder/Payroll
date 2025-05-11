import java.util.ArrayList;
import java.util.Scanner;

public class Payroll {
    // Fields to store employee data
    private ArrayList<Integer> employeeId = new ArrayList<>();
    private ArrayList<Integer> hours = new ArrayList<>();
    private ArrayList<Double> payRate = new ArrayList<>();
    private ArrayList<Double> wages = new ArrayList<>();

     /**
     * Constructor to initialize the employeeId array with default values.
     */
    public Payroll() {
        // Initializing employeeId array
        employeeId.add(5658845);
        employeeId.add(4520125);
        employeeId.add(7895122);
        employeeId.add(8777541);
        employeeId.add(8451277);
        employeeId.add(1302850);
        employeeId.add(7580489);
    }
    /**
     * Accessor method to get the ArrayList of employee identification numbers.
     * @return ArrayList<Integer>: The employee identification numbers.
     */


    public ArrayList<Integer> getEmployeeId() {
        return employeeId;
    }
    
    
 /**
     * Accessor method to get the ArrayList of hours worked by each employee.
     * @return ArrayList<Integer>: The hours worked by each employee.
     */
    public ArrayList<Integer> getHours() {
        return hours;
    }
     /**
     * Accessor method to get the ArrayList of pay rates for each employee.
     * @return ArrayList<Double>: The pay rates for each employee.
     */

    public ArrayList<Double> getPayRate() {
        return payRate;
    }

    
     /**
     * Mutator method to set the hours worked for the employee at the specified index.
     * Validates that hours worked cannot be negative.
     * @param index The index of the employee.
     * @param hoursWorked The number of hours worked by the employee.
     */
    
    public void setHours(int index, int hoursWorked) {
        if (hoursWorked >= 0) {
            this.hours.add(index, hoursWorked);
        } else {
            System.out.println("Error: Hours worked cannot be negative.");
        }
    }

    /**
     * Mutator method to set the pay rate for the employee at the specified index.
     * Validates that the pay rate cannot be less than 6.00.
     * @param index The index of the employee.
     * @param rate The hourly pay rate for the employee.
     */
    public void setPayRate(int index, double rate) {
        if (rate >= 6.00) {
            this.payRate.add(index, rate);
        } else {
            System.out.println("Error: Pay rate cannot be less than 6.00.");
        }
    }

    // Method to calculate wages and store in wages ArrayList
    public void calculateWages() {
        for (int i = 0; i < employeeId.size(); i++) {
            double wage = hours.get(i) * payRate.get(i);
            wages.add(wage);
        }
    }

    /**
     * Method to retrieve the gross pay for the employee with the specified identification number.
     * @param employeeId The identification number of the employee.
     * @return double: The gross pay for the employee.
     */
    
    public double getGrossPay(int employeeId) {
        int index = this.employeeId.indexOf(employeeId);
        if (index != -1) {
            return wages.get(index);
        } else {
            System.out.println("Error: Employee ID not found.");
            return -1;
        }
    }

    // Method to display payroll information
    public void displayPayroll() {
        System.out.println("Employee ID\tGross Wages");
        for (int i = 0; i < employeeId.size(); i++) {
            System.out.println(employeeId.get(i) + "\t\t" + wages.get(i));
        }
    }
}

