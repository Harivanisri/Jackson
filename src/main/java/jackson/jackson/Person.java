package jackson.jackson;

public class Person {
   public int id;
   public String name;
   public String position;
   public double salary;
   public String department;
   public String email;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPosition() {
      return position;
   }

   public void setPosition(String position) {
      this.position = position;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public String getDepartment() {
      return department;
   }

   public void setDepartment(String department) {
      this.department = department;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Person(int id, String name, String position, double salary, String department, String email) {
      super();
      this.id = id;
      this.name = name;
      this.position = position;
      this.salary = salary;
      this.department = department;
      this.email = email;
   }

   @Override
   public String toString() {
      return "Person [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + ", department="
            + department + ", email=" + email + "]";
   }

   public Person() {
      super();
      // TODO Auto-generated constructor stub
   }
}
