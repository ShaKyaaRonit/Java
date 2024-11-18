package lab3.question1;
public class Department {
    int DeptId;
    String DeptName;
    String DeptEmail;
    Department(){
        this.DeptEmail="CS@gmail.com";
        this.DeptId=1;
        this.DeptName="CS";
    }
    void displayDepartmentDetails(){
        System.out.println("DepartmentId:"+DeptId);
        System.out.println("DepartmentName"+DeptName);
        System.out.println("DepartmentEmail"+DeptEmail);
    }

}
