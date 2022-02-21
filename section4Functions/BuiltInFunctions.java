public class BuiltInFunctions {
  public static void main(String[] args) {
    // println is built in function 
    System.out.println("Hello java");

    // sine 
    double sine = Math.sin(1.2);
    System.out.println(sine);

    // power 
    double power = Math.pow(4, 2);
    System.out.println(power);

    // random function will return a number between 0 and 1 
    double random = Math.random();
    System.out.println("random number is: "+random);

    // random number between 0 adn 100 
    int random2 = (int)(Math.random()*100);
    System.out.println("Random number between 0 and 100 is: " + random2);
  }
}
