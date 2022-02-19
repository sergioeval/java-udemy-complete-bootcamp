public class BooleanComparisons {
    public static void main(String[] args) {
        // comparisons in java 
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;

        System.out.println(chemistryGrade >= englishGrade);

        // comparing decimals 
        double sales = 37.5;
        double cost = 5.55;

        System.out.println(sales > cost);

        // for string values use String.equals(String)
        String sentence = "I love this";
        String sentence2 = "I love this";
        System.out.println(sentence.equals(sentence2));
        System.out.println(!sentence.equals(sentence2));

        // == is comparison , = is to set a value.
    }
}
