public class Employee {
   public final String name;
   public final String lastName;

   public Employee(String name, String lastName) {
      this.name = name;
      this.lastName = lastName;
   }

   public String getName() {
      return name;
   }

   public String getLastName() {
      return lastName;
   }
}
