package question3;
public class Customer {
    String foods;
    String grocery;

    // Constructor for Customer
    Customer(String f, String g) {
        this.foods = f;
        this.grocery = g;
    }

    // Base class method
    void display() {
        System.out.println("No discount");
    }

    // Static nested class for CorporateMembers
    static class CorporateMembers extends Customer {
        CorporateMembers(String f, String g) {
            super(f, g);
        }

        @Override
        void display() {
            System.out.println("7% discount for Corporate Members");
        }
    }

    // Static nested class for NonMembers
    static class NonMembers extends Customer {
        NonMembers(String f, String g) {
            super(f, g);
        }

        @Override
        void display() {
            System.out.println("3% discount for Non-Members");
        }
    }

    // Static nested class for ValuedCustomer
    static class ValuedCustomer extends Customer {
        ValuedCustomer(String f, String g) {
            super(f, g);
        }

        @Override
        void display() {
            System.out.println("10% discount for Valued Customer");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects of different customer types
        Customer Ronit = new ValuedCustomer("MOMO", "Dishwasher");
        Customer Ram = new CorporateMembers("MOMO", "Dishwasher");
        Customer Sita = new NonMembers("MOMO", "Dishwasher");

        // Calling the display method based on customer type
        Ronit.display();
        Ram.display();
        Sita.display();
    }
}
