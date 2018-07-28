/**
 * Tests the employeee class by printing the salary and name of a employee on to the console
 * @author Salek Khan
 */
public class employeeTester 
{ 
    public static void main(String[] args)
    { 
        employee pi = new employee("Double O Pi", 50000); 
        /**
         * Display Pi's Name and Salary 
         */
        System.out.println("Name: " + pi.getName() + "\n" + "Salary: " + pi.getSalary()); 

        /**
         * Raise Pi's Salary by 10% 
         */
        pi.raiseSalary(10); 
        System.out.println(pi.getName() + "'s new salry is: " + pi.getSalary()); 
    } 
} 
