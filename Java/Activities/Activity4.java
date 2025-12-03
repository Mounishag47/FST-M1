package activities;

public class Activity4 {

    public static void main(String[] args) {

        int[] numbers = {9, 5, 1, 4, 3};

        System.out.println("Before Sorting:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("After Sorting:");
        printArray(numbers);
    }

   
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

         
            arr[j + 1] = current;
        }
    }

   
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
