package lab3.question1;
public class Employee 
{
    int Id;
    String Name;
    String Address;
    Department dept;
    Employee(int Id,String Name,String Address,Department dept)
    {
            this.Id=Id;
            this.Name=Name;
            this.Address=Address;
            this.dept=dept;
    }
    void displayDetails()
    {
        System.out.println("Employee Details:");
        System.out.println("Id:"+Id);
        System.out.println("Name:"+Name);
        System.out.println("Address:"+Address);
        System.out.println("Department Details");
        dept.displayDepartmentDetails();
    }
}
