import java.util.Scanner;

public class  Delimiters {
    public static void main(String[] args) {
        // the scan can take serveral inputs using withe space as a delimiter 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers on the same Line: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("NUm 1 is: "+num1+" and num2 is: "+num2);

        System.out.println("Enter two very big numbers on same line ");
        long long1 = scan.nextLong();
        long long2 = scan.nextLong();
        System.out.println("long 1 is: "+long1+" and long2 is: "+long2);

        System.out.println("Enter two decimals on same line ");
        double dec1 = scan.nextDouble();
        double dec2 = scan.nextDouble();

        System.out.println("Enter two text values on same line ");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();
    }
}
