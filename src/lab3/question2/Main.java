package lab3.question2;
public class Main {
    public static void main(String[] args) {
        Library Ronit = new Library(12, "Andrew", "Living in a jet", "CheckedIN");
        Library Shyam = new Library(13, "Andrew Taatti", "Bald with Cigar", "CheckedOut");
        Ronit.display();
        Shyam.display();
    }
}
