public class EmployeeClass {
	
   private int id;
   private String lastName;
   private String firstName;
   private int salary;
   
   
   public EmployeeClass(int id,String lastName,String firstName, int salary ){ 
	   this.id = id;
	   this.lastName = lastName;
	   this.firstName = firstName; 
	   this.salary = salary;
   }
   
   public int getID(){ 
	   return id;
   }
   
   public String getFirstName(){ 
	   return firstName;
   }
   
   public String getLastName(){ 
	   return lastName; 
   }
   
   public String getName(){ 
	   return lastName + " " + firstName; 
   }
   
   public int getSalary(){ 
	   return salary; 
   }
   
   public void setSalary (int salary){ 
	   this.salary = salary; 
   }
   
   public int getAnnualSalary(){ 
	   return salary*12; 
   }
   
   public int raiseSalary(int percent){ 
	   return (int)((percent / 100.0) * salary + salary);
   }
   

   public String toString() {
      return "Employee[id=" + id + " ,name=" + firstName + " " + lastName + " ,salary=" + salary + "]";
   }
}








