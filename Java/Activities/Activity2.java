package activities;

public class Activity2 {

    public static void main(String[] args) {
        int[] numbers = {10, 77, 10, 54, -11, 10};

        int sum = sumOfTens(numbers);       
        boolean result = checkIfThirty(sum);

        System.out.println("Sum of all 10's: " + sum);
        System.out.println("Result: " + result);
    }

   
    public static int sumOfTens(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num == 10) {
                sum += num;
            }
        }
        return sum;
    }

    public static boolean checkIfThirty(int sum) {
        return sum == 30;
    }
}