public class LogicalOperators {
    public static void main(String[] args) {
        // or || operator 
        int chemistryGrade = 75;
        int englishGrade = 65;
        String lan = "java";

        if (chemistryGrade > 75 || englishGrade > 75 || lan.equals("java")) {
            System.out.println("Congratilations, you got the scholaship");
        } else {
            System.out.println("You didn't get the scholaship");
        }
        // the AND & operator 
        int credits = 56;
        double GPA = 3.2;

        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You got it ");
        } else {
            System.out.println("You didn't got it ");
        }
    }
}
