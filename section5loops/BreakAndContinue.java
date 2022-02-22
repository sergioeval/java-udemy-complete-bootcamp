public class BreakAndContinue {
  public static void main(String[] args) {
    // continue will skip a single run and continue to the nextone 
    // break will finish the loop 
    for (int i = 0; i <= 10; i++) {
      if (i%2 != 0) {
        continue;
      }
      System.out.println("The counter is: " + i);
    }
  }
}
