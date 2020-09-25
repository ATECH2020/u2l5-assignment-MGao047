import java.util.Scanner;

public class ConstructionTester {
  public static void main(String[] args) {
    double taxRate;
    int numBoards;
    int numWindows;
   
    Scanner theScanner = new scanner(System.in);

    System.out.print("Enter the sales tax rate:");
    taxRate = theScanner.nextDouble();
    System.out.println("How many boards do you need?");
    numBoards = theScanner.nextInt();
    System.out.println("How many windows do you need?");
    numWindows = theScanner.nextInt();


     Construction theConstruction = new Construction(8.0,11.0,taxRate);

  }
}