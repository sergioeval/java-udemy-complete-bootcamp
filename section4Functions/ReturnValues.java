public class ReturnValues {
  public static void main(String[] args) {
    double area = measureRectangle(2.2, 4.3);
    stringPrinter(2.2, 4.3, area);
  }

  public static double measureRectangle(double len, double width) {
    double area = len * width;
    return area;
  }

  public static void stringPrinter(double len, double width, double area) {
    System.out.println("The rectangle with len=" + len + " and width=" + width + " Has an area of " + area);
  }
}
