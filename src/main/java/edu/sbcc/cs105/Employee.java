/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Kaelynn Stiles
 */
package edu.sbcc.cs105;

/**
 * This class implements an emplyee which is a person with a name and a salary.
 *
 */

public class Employee {

    private String firstName;
    private double salary;

    /**
     * Constructor that creates a new Employee with an initial name and salary.
     * 
     */
    public Employee(String employeeName, double currentSalary) {

        firstName = employeeName;   
        salary = currentSalary;
    }


    public String getName() {
        return firstName;
		
    }

    public double getSalary() {
        return salary;
		
    }

    /**
     * Raise the salary by the amount specified by the explicit argument.
     * 
     */
    public void raiseSalary(double byPercent) {

        double raise = this.salary * byPercent / 100;
        this.salary += raise;
        
    }



  
}