import java.util.List;

public class FinanceOffice {

   public static double getAllSalaries(List<Employee> employees) {
      double salarySum = 0;
      for (Employee employee : employees) {
         salarySum += employee.getSalary();
      }
      return salarySum;
   }

}
