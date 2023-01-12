import java.util.Scanner;

public class ScannerIntroduction {
  public static void main( String[] args ) {
    Scanner scan = new Scanner(System.in);

    String userName = "";
    System.out.println("What is your name? ");
    userName = scan.next();

    System.out.printf("Hello %s! It's nice to meet you.", userName);
  }
}
