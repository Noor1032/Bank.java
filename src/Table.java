import java.util.Scanner;
public class Table {
    public static void main(String [] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num = inp.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = inp.nextInt();
        //System.out.println("<=====Table Of 8=====>");
        for(int i = 1 ; i <= 10 ; i++)
       // System.out.println(num + "*" + i + "=" + num * i);
        //for (int j = 1 ; j <= 10 ; j++)
            System.out.println(num + "*" + i + "=" + num * i +"   " + num2 + "*" + i + "=" + num2 * i);

    }
}
