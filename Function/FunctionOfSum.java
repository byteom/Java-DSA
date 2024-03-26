import java.util.Scanner;

public class FunctionOfSum {
    public static void main(String[] args) {
        sum(); // Calling the sum method
        Greeating(); // Calling the Greeating method
        int ans = sum2(); // Storing the result of sum2 method in 'ans'
        System.out.println(ans); // Printing the value of 'ans'
        int ans2 = sum4(5, 7); // Storing the result of sum4 method in 'ans2'
        System.out.println(ans2); // Printing the value of 'ans2'
    }
    
    static void sum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Taking input for 'a'
        int b = sc.nextInt(); // Taking input for 'b'
        int sum = a + b; // Calculating the sum of 'a' and 'b'
        System.out.println(sum); // Printing the sum
    }
    
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Taking input for 'a'
        int b = sc.nextInt(); // Taking input for 'b'
        int sum2 = a + b; // Calculating the sum of 'a' and 'b'
        return sum2; // Returning the sum2
    }
    
    static void Greeating() {
        System.out.println("Hello world"); // Printing "Hello world"
    }

    static int sum4(int a, int b) {
        int sum = a + b; // Calculating the sum of a and b
        return sum; // Returning the sum
    }
}
