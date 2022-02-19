import java.util.Scanner;

public class Survey {
  public static void main(String[] args) {
    int counter = 0;
    // using scanner to get inputs from the user 
    Scanner scan = new Scanner(System.in);
    // using nextLine
    System.out.println("Welcome. Thanks for taking this survey");
    System.out.println("What is your name?");
    counter ++;
    String name = scan.nextLine();
    System.out.println("Hi " + name);
    
    System.out.println("How much money do you spend on coffe? ");
    counter ++;
    double coffePrice = scan.nextDouble();
    System.out.println("You are spending $"+coffePrice+ " in coffe");

    System.out.println("How much money do you spend on fast food?");
    counter ++;
    double foodPrice = scan.nextDouble();
    System.out.println("You are spending $"+foodPrice+" in fast food");

    // always close the scanner when youare done working with it 
    scan.close();

    // scanner part 2 
    System.out.println("\nThanks for aswering all " +counter+" question");
  }
}
