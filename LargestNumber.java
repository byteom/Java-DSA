import java.util.Scanner;
import java.io.*;

public class LargestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a<b && a<c){
            System.out.println("A is greater");
        }else if(b<a && b<c){
            System.out.println("B is greater");
        }else{
            System.out.println("C is greater");
        }
    }
}
