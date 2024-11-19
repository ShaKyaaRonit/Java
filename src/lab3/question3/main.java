package lab3.question3;
public class main {
    public static void main(String[] args) 
    {
    Player Ronit = new Player(1, 2);
    Player Shyam = new Player(3, 4);
    Ronit.display();
    Shyam.display();
    Ronit.move(10, 20);
    Shyam.move(30, 40);
    Ronit.newdisplay();
    Shyam.newdisplay();
}
}
