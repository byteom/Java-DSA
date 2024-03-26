public class Array{
    public static void main(String[] args){
        // Prints "Hello" to the console
        System.out.println("Hello");

        // Declares an array of integers with a length of 5
        int[] arr = new int[5];
        int [] ros; // deceleration of array . ros is getting defined in stack
        ros= new int [5]; // intilization : accutully here object is being created in the heap.

        // Declares and initializes an array of integers with values 1,2,3,4,5
        int [] arr2= {1,2,3,4,5};

        // Loops through the array arr2 and prints each value to the console
        for(int i =0;i<5;i++){
            System.out.println(arr2[i]);
        }
    }
}
