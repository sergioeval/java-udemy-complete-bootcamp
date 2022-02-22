import java.util.Arrays;

public class UpdatingArrays {
  // main function 
  public static void main(String[] args) {
    String[] menu = {"Expresso", "Ice Coffe", "Makiato"};

    // updating the array change makiatto to latte  
    menu[2] = "Latte";
    String menuString = Arrays.toString(menu);
    System.out.println(menuString);

    // if we want to expand the array we can only do it creating a new array 
    String[] newMenu = new String[5];
    for (int i = 0; i < menu.length ; i++) {
      // copying the old array element to the new array 
      newMenu[i] = menu[i];
    }

    //adding the new coffoes 
    newMenu[3] = "House Blend";
    newMenu[4] = "Dark Roast"; 

    // print new menu 
    System.out.println(Arrays.toString(newMenu));
  }

  // Other functions 
}
