package activities;

@FunctionalInterface
interface Addable {
    int add(int num1, int num2);
}

public class Activity12 {
    public static void main(String[] args) {

        Addable ad1 = (a, b) -> (a + b);

        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };

        // Testing the lambda expressions
        System.out.println("ad1: " + ad1.add(5, 10));
        System.out.println("ad2: " + ad2.add(7, 8));
    }
}
