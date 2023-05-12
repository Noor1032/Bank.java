import java.util.Scanner;
public class Even {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int a = input.nextInt();
        if (a%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }


    }
}
