package lab4.question4;
public class CurrentAccount {
    double balance;
    int overdraftLimit;

    CurrentAccount(double b,int o){
        this.balance= b;
        this.overdraftLimit=o;
    }
    void dislayingcurrentAccount(){
        System.out.println("balance:"+ balance + "overdraftLimit:"+ overdraftLimit);
    }
}
