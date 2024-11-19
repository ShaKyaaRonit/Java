package lab3.question2;
public class Library {
int bookNumbers;
String author;
String title;
String status;
Library(int bookNumbers,String author, String title,String status){
    this.bookNumbers=bookNumbers;
    this.author=author;
    this.title=title;
    this.status=status;
}
    void display(){
            System.out.println("Details:");
            System.out.println("Author:"+author +" "+ "Tittle:"+title +" "+ "BookNumber:"+bookNumbers+" " + "Status:"+status);
    }
}