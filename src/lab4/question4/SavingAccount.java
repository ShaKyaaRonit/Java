package lab4.question4;

public class SavingAccount {
 double balance;
 double interestRate;
    SavingAccount(double balance,double interestRate)
    {
    this.balance=balance;
    this.interestRate=interestRate;
    }
    void display()
    {
        System.out.println("balance:"+ balance + "interest rate:"+interestRate);
    }
}

