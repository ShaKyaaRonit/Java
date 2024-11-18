public class Main {
    public static void main(String[] args) {
        shape ashape = new shape();
        shape bshape = new shape();
        shape cshape = new shape();
        ashape.draw();
        ashape.erase();
        System.out.println("NEXT");
        bshape.draw();
        bshape.erase();
        System.out.println("Fowarding");
        cshape.draw();
        cshape.erase();
    }
}
