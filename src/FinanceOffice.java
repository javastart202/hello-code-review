import java.util.List;

public class FinanceOffice {

   public static double getAllSalaries(List<Employee> employees) {
      double salarySum = employees.stream().mapToDouble(Employee::getSalary).sum();
      return salarySum;
   }

}
