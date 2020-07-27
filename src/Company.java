import java.util.Arrays;
import java.util.List;

public class Company {
   public static void main(String[] args) {
      List<Employee> employees = Arrays.asList(new Employee("a", "b", 2345));
      double allSalaries = FinanceOffice.getAllSalaries(employees);
      System.out.println(employees);
      System.out.println("allSalaries = " + allSalaries);
   }
}
