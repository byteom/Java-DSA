import java.util.Scanner;
public class CountOccurence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int count =0;
        System.out.print("Enter the target number: ");
        int target = input.nextInt();

        for(int i=0;i<num;i++){
            int digit= num%10;
            if(digit ==target){
                count++;
            } num=num/10;
        }System.out.println("Occurence of target number: "+count);
    }
}
