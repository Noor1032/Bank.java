import java.util.Scanner;
public class largest {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int c = sc.nextInt();

        if (a > b || a > c) {
            //if (a>c){
            System.out.println("First Number Is Largest");
        } else if (b > a) {
            if (b>c){
            System.out.println("Second Number Is Largest");
        } else {
            System.out.println("Third Number is Largest");
        }//else{
           // System.out.println("invalid Number");
        }
    }
}
