//Write a program to create a class named shape. In this class we have three subclasses Circle, Triangle and Square. 
//Each class has two member functions named draw () and erase (). 
public class shape {
 void draw(){
    System.out.println("Drawing ");
 }
 void erase(){
    System.out.println("Erasing");
 }
    class Circle extends shape{
        void draw(){
            System.out.println("Draw cicle");
        }
        void erase(){
            System.out.println("Erase circle");
        }

    }
    class Triangle {
        void draw(){
            System.out.println("Draw triangle");
        }
        void erase(){
            System.out.println("Erase triangle");
        }
    }
    class Square{
        void draw(){
            System.out.println("Draw square");
        }
        void erase(){
            System.out.println("Erase square");
        }
    }
    
}
