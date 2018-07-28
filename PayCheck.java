import java.util.Scanner; 
public class PayCheck 
{ 
    private double hourlyWage;
    private double hoursWorked;
    Scanner myScanner = new Scanner(System.in); 
    public PayCheck()
    { 
       System.out.print ("Please input the hourly wage:"); 
       hourlyWage = myScanner.nextDouble(); 
       if (hourlyWage <= 0)
       {
           System.out.print ("Please input a non-negitive wage:"); 
           hourlyWage = myScanner.nextInt();
        }
       System.out.println("Please input the amount of hours worked:"); 
       hoursWorked = myScanner.nextDouble(); 
       if (hoursWorked <= 0)
       {
           System.out.print ("Please input a non-negitive amount of hours:"); 
           hoursWorked = myScanner.nextDouble();
       }
    }
    public double getSalary()
    {
       double salary = 0;
        if (hoursWorked <= 40 && hoursWorked > 0) 
       { 
           salary = hoursWorked * (double) hourlyWage; 
        } 
        else if (hoursWorked >40)
       { 
          salary = (((hoursWorked - 40) * (1.5*hourlyWage)) + 40*hourlyWage) ; 
       } 
       System.out.println(salary);
       return salary;
    }  
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    public double getHourlyWage()
    {
        return hourlyWage;
    }
}