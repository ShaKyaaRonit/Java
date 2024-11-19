package lab3.question3;
public class Player {
int x;
int y;
Player(int x, int y){
this.x=x;
this.y=y;
}
void move(int newx,int newy){
    this.x=newx;
    this.y=newy;
}
void display(){
    System.out.println("Before Moving:");
    System.out.println("PLayer is at:"+x +"  "+y);
}
void newdisplay(){
    System.out.println("After Moving:");
    System.out.println("PLayer is at:"+x +"  "+y);
}

}