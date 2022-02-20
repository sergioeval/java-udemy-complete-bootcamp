public class Parameters {
  public static void main(String[] args) {
    measureRectangle(2.2, 4.3);
  }

  public static void measureRectangle(double len, double width) {
    double area = len * width;
    System.out.println("The area of the rectangle is: " + area + "\n");
  }
}
