import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.UnsupportedEncodingException;
public class PayCheckTester
{
    public static void main(String[] args) throws FileNotFoundException ,UnsupportedEncodingException
    {
       Scanner myScanner = new Scanner(System.in);
       System.out.println("How many computations would you like too run?");
       int computationAmount = myScanner.nextInt();
       PrintWriter writer = new PrintWriter("output.txt"); 
       if(computationAmount <= 0) 
       {
           System.out.println("Enter a valid amount of computations"); 
           computationAmount = myScanner.nextInt();
       }
       for( int j = 1; j <= computationAmount; j++)
       {
           PayCheck salary = new PayCheck();
           writer.println ("Hours Worked:" + salary.getHoursWorked());
           writer.println ("Hourly Wage:" + salary.getHourlyWage());
           writer.println ("Salary:" + salary.getSalary());
           System.out.println ("");
           writer.println ("");
       }
       writer.close ();
    } 
}