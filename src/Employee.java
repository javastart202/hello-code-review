public class Employee {
   private final String name;
   private final String lastName;
   private final double salary;

   public Employee(String name, String lastName, double salary) {
      this.name = name;
      this.lastName = lastName;
      this.salary = salary;
   }

   public String getName() {
      return name;
   }

   public String getLastName() {
      return lastName;
   }

   public double getSalary() {
      return salary;
   }

   @Override
   public String toString() {
      return "Employee{" +
          "name='" + name + '\'' +
          ", lastName='" + lastName + '\'' +
          ", salary=" + salary +
          '}';
   }
}
