import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        char a= input.nextLine().charAt(0);
        if(a>='a' && a<='z'){
            System.out.println("Lowercase");
        }else if(a>='A' && a<='Z'){
            System.out.println("Uppercase");
        }else{
            System.out.println("Invalid");
        }
    }
}
