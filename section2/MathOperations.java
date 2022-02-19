public class MathOperations {
  public static void main(String[] args) {
    // variables 
    int bagOfWeets1 = 5;
    int bagOfSweets2 = 10;

    long startsInMilkyWay = 25000000000L;
    long starsInAndromeda = 1000000000000L;

    double testScore = 6.7;
    double bonusMarks = 2.5;

    System.out.println(bagOfWeets1 + bagOfSweets2);
    System.out.println(startsInMilkyWay + starsInAndromeda);
    System.out.println(testScore + bonusMarks);

    System.out.println(bagOfSweets2 / bagOfWeets1);
    System.out.println(starsInAndromeda/startsInMilkyWay);
    System.out.println(testScore/bonusMarks);
    
    // modulus we can use this operator % to see if a number is even or odd 
    System.out.println(10%2);
    System.out.println(5%2);

    // the ++ operator will add 1 to the number 
    int counter = 0;
    counter ++;
    counter ++;
    System.out.println(counter);

    // the -- operator wil decresse by 1 
    counter --;
    counter --;
    System.out.println(counter);

    // the += willl add the value from the right 
    // the -= will decrease the value by the number from the right 
  }
}
