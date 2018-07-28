/**
 * Class creates an employee with specific characteristics
 * @author Salek Khan
 */
public class employee 
{ 
    /** 
     * An Employee has a name, and a salary 
    */ 
    private String name; 
    private double salary; 

    public employee(String employeeName, double currentSalary)
    { 
        name = employeeName;
        salary = currentSalary; 
    } 
    /** 
     * @return name Return the name of the employee 
     */ 
    public String getName()
    {
        return name; 
    } 
    /** 
     * @retun salary Return the salary of the employee 
    */ 
    public double getSalary()
    {
        return salary; 
    } 
    /** 
     * @param byPercent Raise Salary by given amount 
    */ 
    public void raiseSalary(double byPercent)
    {
        salary += ((byPercent/100) * salary); 
    } 
}