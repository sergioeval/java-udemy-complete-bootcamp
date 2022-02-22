public class WhileLoops {
  public static void main(String[] args) {
    int number = 25;
    while (number <= 30) {
      System.out.println("The number is: "+ number);
      number += 1;
    }

    // use a while loop only when it is necesary
    double choice = 0.01;
    double guess = 0.99;

    while (guess > choice) {
      System.out.println("Hi I am in the while loop");
      guess = Math.random();
      System.out.println("Now the guess number is: " + guess);
    }
  }
}
