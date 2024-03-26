public class ParameterFunction{
    public static void main(String[] args) {
        int ans = sum(2, 3); // Calling the sum method with arguments 2 and 3
        System.out.println(ans); // Printing the result
    }

    static int sum(int a, int b) {
        int sum = a + b; // Calculating the sum of a and b
        return sum; // Returning the sum
    }
}
