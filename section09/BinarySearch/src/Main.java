import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(20);
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));
        if (search(70, randomArray)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not Found");
        }
    }

    private static int[] getRandomArray(int n) {
        Random random = new Random();
        int[] randomArray = new int[n];
        for (int i = 0; i < n; i++) {
             randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }

    private static boolean search(int x, int[] array) {
        return search(x, array, 0, array.length - 1);
    }

    private static boolean search(int x, int[] array, int i, int n) {
        if (i > n) {
            return false;
        }

        int m = i + (n - i)/2;

        if (array[m] == x) {
            return true;
        } else if (array[m] > x) {
            return search(x, array, i, m - 1);
        } else {
            return search(x, array, m + 1, n);
        }
    }

}