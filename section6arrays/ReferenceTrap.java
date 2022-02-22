import java.util.Arrays;

public class ReferenceTrap {
  public static void main(String[] args) {
    String[] staffLastYear = {"Tomy", "Joel", "Ellie"};
    System.out.println(Arrays.toString(staffLastYear));

    // copying the array in a bad way 
    // String[] staffNew = staffLastYear;
    String[] staffNew = Arrays.copyOf(staffLastYear, staffLastYear.length);
    System.out.println(Arrays.toString(staffNew));

    //modify staffNew
    staffNew[0] = "Juan";

    // print both arrays 
    // both arrays were modifed because is only a reference 
    System.out.println("Last year staff is: " + Arrays.toString(staffLastYear));
    System.out.println("New staff is: " + Arrays.toString(staffNew));

    // the solution is to create a new arrays and then copy the elements with a for loop 
    // or you can use teh Arrays.coppyOf
  }
}
