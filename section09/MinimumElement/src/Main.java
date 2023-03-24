import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int len = 5;
        int[] myList = readIntegers(len);
        System.out.println("MIN_VALUE= " + findMin(myList));
    }

    public static int[] readIntegers(int n) {
        int[] intArray = new int[n];
        int i = 0;
        while (i < n) {
            System.out.print("Enter an integer: ");
            try {
                intArray[i] = Integer.parseInt(scan.nextLine());
                i++;
            } catch (Exception e) {
                System.out.println("Invalid integer, try again");
                i--;
            }
        }
        return intArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}