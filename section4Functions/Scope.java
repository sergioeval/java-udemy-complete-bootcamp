public class Scope {
  // you can not access a variable from main to a nother function or from other function to main, ecause of the scopeof the variables 
  // But yu will be able to access a class variable from anywhere inside the clasee 
  static int dogs = 5;
  public static void main(String[] args) {
    System.out.println(dogs);
    someFunction();
  }

  public static void someFunction() {
    System.out.println(dogs);
  }
}
