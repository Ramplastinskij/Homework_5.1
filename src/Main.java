import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework_5.1");

        //Task 1
        int[] arr = new int[]{1, 2, 3};
        double[] numbers = {1.57, 7.654, 9.986};
        int[] arbitraryNumbers = new int[]{5, 10, 15, 20, 25};

        // Task 2
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
            if (i != numbers.length - 1) {
            }
        }
        System.out.println();
        for (int i = 0; i < arbitraryNumbers.length; i++) {
            System.out.print(arbitraryNumbers[i]);
            if (i != arbitraryNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        //Task 3
        System.out.println();
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        for (int i = arbitraryNumbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arbitraryNumbers[i] + ", ");
            } else {
                System.out.print(arbitraryNumbers[i]);
            }
        }
        //Task 4
        System.out.println();
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        System.out.println("Преобразованный массив: " + Arrays.toString (arr));
    }
}