/**
 * Tests the function of methods in the Worker class
 * @author Salek Khan
 */
public class WorkerTester 
 {
     /**
      * Tests the function of methods in the Worker class
      */
     public static void main(String[] args)
     {
         Worker joe = new SalariedWorker("Joe",15);
         Worker james = new HourlyWorker("James",60);
         System.out.println("Salaried Worker:\nName: " + joe.getName() + 
                           "\nExpected pay: 600 \nActual pay: " + joe.computePay(50) + "\n");
        System.out.println("Hourly Worker:\nName: " + james.getName() + 
                           "\nExpected pay: 3300 \nActual pay: " + james.computePay(50) + "\n");
     }
}