/*A university has different types of employees, including faculty members and administrative staff. The university wants to keep track of their personal information, such as their names and contact details, as well as their job-specific information, such as their salary and job title. Create a superclass called "Employee" with the following attributes: name (String)
email (String)
phone number (String)
Create two subclasses of Employee: FacultyMember, with the additional attribute of "department" (String)
AdministrativeStaff, with the additional attribute of "jobTitle" (String)
Create a constructor for each subclass that initializes its respective additional attribute(s) along with the attributes inherited from the superclass. Create a method for each subclass to display its specific attributes along with the attributes inherited from the superclass. In the main method, create at least one object of each subclass and call the respective method to display their attributes.*/
class Employee{
  String name ;
  String email;
  String phoneNumber;
  Employee(String n , String e , String p)
  {
    name = n;
    email = e;
    phoneNumber = p ;
    
  }
  void show()
  {
   System.out.println("Employee Name : " + name);
   System.out.println("Employee email : " + email);
   System.out.println("Employee phonenumber : " + phoneNumber);
  }
}
class FacultyMember extends Employee{
  String Department;
  FacultyMember(String n,String e,String p,String d)
  {
   super(n,e,p);
   Department = d;
   {
    
    show();
    System.out.println("Employee Department : "  + d);
    System.out.println("******************");
   }
  } 
}

class AdministrativeStaff extends Employee {
  String jobtitle;
  AdministrativeStaff(String n,String e,String p,String job){
 super (n,e,p);
 jobtitle = job;
{
 show();
 System.out.println("Employee JobTittle: "  + job);
}
}
}

class c20_oops{
  public static void main (String args[]){
    FacultyMember f = new FacultyMember("vinay","123@gmail.com","1234567890","EEE");
AdministrativeStaff a = new AdministrativeStaff("vinay","123@gmail.com","1234567890","Professor"); 
  }
}