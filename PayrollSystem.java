Abstract Employee class
abstract class Employee {
String name;
int employeeID;
public Employee(String name, int employeeID) {
this.name = name;
this.employeeID = employeeID;
}
// Abstract method to calculate salary
public abstract double calculateSalary();
public void displayDetails() {
System.out.println("Employee Name: " + name);
System.out.println("Employee ID: " + employeeID);
}
}
// Full-time Employee subclass
class FullTimeEmployee extends Employee {
double monthlySalary;
public FullTimeEmployee(String name, int employeeID, double monthlySalary) {
super(name, employeeID);
this.monthlySalary = monthlySalary;
}
// Implementation of calculateSalary for full-time employees
@Override
public double calculateSalary() {
return monthlySalary;
}
}
// Part-time Employee subclass
class PartTimeEmployee extends Employee {
double hourlyRate;
double hoursWorked;
public PartTimeEmployee(String name, int employeeID, double hourlyRate, double hoursWorked) {
super(name, employeeID);
this.hourlyRate = hourlyRate;
this.hoursWorked = hoursWorked;
}
// Implementation of calculateSalary for part-time employees
@Override
public double calculateSalary() {
return hourlyRate * hoursWorked;
}
}
public class PayrollSystem {
public static void main(String[] args) {
// Creating instances of full-time and part-time employees
FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 101, 5000.0);
PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 102, 12.0, 40.0);
// Calculating and displaying employee details and salaries
fullTimeEmployee.displayDetails();
System.out.println("Monthly Salary: $" + fullTimeEmployee.calculateSalary());
System.out.println();
partTimeEmployee.displayDetails();
System.out.println("Hourly Rate: $" + partTimeEmployee.hourlyRate);
System.out.println("Hours Worked: " + partTimeEmployee.hoursWorked);
System.out.println("Salary: $" + partTimeEmployee.calculateSalary());
}
}
