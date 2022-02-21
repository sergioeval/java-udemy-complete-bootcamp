public class ReturnValues {
  public static void main(String[] args) {
    double area = measureRectangle(2.2, -1, "area");
    double perimeter = measureRectangle(2.2, 4.3, "perimeter");
    stringPrinter(2.2, 4.3, area, "area");
    stringPrinter(2.2, 4.3, perimeter, "perimeter");
  }

  public static double measureRectangle(double len, double width, String option) {
    if (len < 0 || width < 0){
      System.out.println("You entered a no valid argument");
      System.exit(0);
    }

    switch (option){
      case "area": return len * width;
      case "perimeter": return len + len + width + width;
      default: return 9999.99;
    }
  }

  public static void stringPrinter(double len, double width, double measure, String option) {
    System.out.println("The rectangle with len=" + len + " and width=" + width + " Has an "+ option + " of " + measure);
  }
}
