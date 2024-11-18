package lab3.question1;
public class Main {
    public static void main(String[] args) {
        Department abc = new Department();
        Employee abcd = new Employee(111, "Ronit", "Pkr", abc);
        abcd.displayDetails();
    }
}
