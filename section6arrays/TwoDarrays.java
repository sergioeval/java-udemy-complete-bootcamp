import java.util.Arrays;

public class  TwoDarrays {
  public static void main(String[] args) {
    int[][] grades = new int[3][4];

    // updating the 2 d array 
    grades[0][0] = 72;
    grades[0][1] = 74;
    grades[0][2] = 78;
    grades[0][3] = 76;

    // printing the 2d array 
    System.out.println("\tHarry    " + Arrays.toString(grades[0]));
    System.out.println("\tRon      "+ Arrays.toString(grades[1]));
    System.out.println("\tHermione " + Arrays.toString(grades[2]));

    // another way of create the 2d array with the data is tHis
    int[][] grades2 = {
      {72, 74, 78, 76},
      {65, 64, 61, 67},
      {95, 98, 99, 100}
    };

    // printint the array in loop 
    System.out.println("\nPrinting the array 2\n");
    for (int i = 0; i<grades2.length; i++) {
      System.out.println(Arrays.toString(grades2[i]));
    }

    // looping trough the array 
    System.out.println("\nPrinting the whole array using two for loops\n");
    for (int i = 0; i < grades2.length; i++){

      switch (i) {
        case 0: System.out.print("\tHarry: "); break;
        case 1: System.out.print("\tRon: "); break;
        case 2: System.out.print("\tHermione: "); break;
      }

      for (int j = 0; j < grades2[i].length; j++){
        // de esta forma imprimimos todo en una linea 
        System.out.print(grades2[i][j]+" ");
      }
      System.out.print("\n");
    }
  }
}
