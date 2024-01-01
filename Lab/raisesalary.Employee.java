/*						Program 3
 * Make a class called Employee, which models an employee with an id, name and salary designed as shown in the
 * following class diagram.
 *
 *
 *
 *
 * The method raiseSalary(percent) increase the salary given by the percentage.
 * Develop the Employee class and suitable method of demonstration.
 */

package raisesalary;

import java.util.Scanner;

class Employee{
	int empID;
	String empName;
	float empSalary;

	public void raiseSalary(double percentage){
		double increaseAmount=(percentage/100)*empSalary;
		empSalary+=increaseAmount;
		System.out.println(empName+"'s Salary increased by "+percentage+"%");
		System.out.println("New Salary "+empSalary);
	}

	public void get
}
