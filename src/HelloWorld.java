import java.util.Arrays;
import java.util.List;

public class HelloWorld {
   public static void main(String[] args) {
      System.out.println("Hello from github");
      List<Employee> employees = Arrays.asList(new Employee("a", "b", 2345));
      double allSalaries = FinanceOffice.getAllSalaries(employees);
      System.out.println("allSalaries = " + allSalaries);
   }
}
