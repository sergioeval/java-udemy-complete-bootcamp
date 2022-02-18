// you can join text to an string 

public class JoiningStrings {
  public static void main(String[] args) {
    // Variables 
    String sentence = "Number of passengers are: ";
    int passengers = 0;

    passengers += 9;
    System.out.println(sentence+passengers);
    passengers -= 5;
    System.out.println(sentence + passengers);
    passengers -= 4;
    System.out.println(sentence + passengers);

    // modifying the string variable 
    sentence = "end of shift";
    System.out.println(sentence);
  }
}
