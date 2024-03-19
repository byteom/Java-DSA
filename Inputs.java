import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter roll number:");
       int rollNum = Integer.parseInt(input.nextLine());
       
       System.out.println("Enter name:");
       String name = input.nextLine(); // Read the entire line for the name
       
       System.out.println("Enter marks:");
       float marks = Float.parseFloat(input.nextLine());
       
       System.out.println("Roll Number: " + rollNum);  //printing the value of roll number
       System.out.println("Name: " + name);  //printing the value of name
       System.out.println("Marks: " + marks);  //printing the value of marks
    }
}
