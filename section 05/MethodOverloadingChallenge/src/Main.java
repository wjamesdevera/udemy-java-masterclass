public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8) + " cm");
    }

    public static double convertToCentimeters(int inch) {
        return inch * 2.54;
    }

    public static double convertToCentimeters(int feet, int inch) {
        int totalInches = (feet * 12) + inch;
        return convertToCentimeters(totalInches);
    }
}