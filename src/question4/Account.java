package question4;
public class Account {
    void deposit(){
     System.out.println("Debited");
    }
    void withdrawn(){
     System.out.println("Credited");
    }
    void viewbalance(){
     System.out.println("Remaining Balance");
    }
  public static void main(String[] args) {
    CurrentAccount RonitCurrent = new CurrentAccount(2000,1);
    SavingAccount RonitSaving = new SavingAccount(1000000, 10);
    RonitCurrent.dislayingcurrentAccount();
    RonitSaving.display();

  }
}
