import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position of the Fibonacci number: ");
        int num = input.nextInt();
        
        if (num <= 0) {
            System.out.println("Invalid input. Please enter a positive integer greater than 0.");
            return;
        }
        
        int p = 0; // Previous Fibonacci number
        int b = 1; // Current Fibonacci number
        int count = 2; // Start from the 2nd Fibonacci number
        
        while (count <= num) {
            int temp = b;
            b = b + p;
            p = temp;
            count++;
        }
        
        System.out.println("The Fibonacci number at position " + num + " is: " + b);
    }
}
