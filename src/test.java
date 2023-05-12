import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Units Counsumed by user : ");
        int unit = sc.nextInt();
        int result;
        int rem,m,first,second,third,fourth,fifth,sixth,seven,eight,nine;
        if (unit <= 100) {
            result = unit * 5;
            System.out.println("your Electricity Bill is Rs : " + result);
        } else if (unit >= 100 && unit <= 200) {
            m = unit - 100;
            rem = 100 * 5;
            result = (m * 7) + rem;
            System.out.println("your Electricity Bill is Rs : " + result);
        }else if(unit >= 200 && unit <= 300){
            first = unit - 100;
            second = 100 * 5;
            third = first - 100;
            fourth = 100 * 7;
            rem = third * 10;
            result = second + fourth + rem;
            System.out.println("Your Electricity Bill is Rs : "+result);
        }else if(unit >= 300 && unit <= 400){
            first = unit - 100;
            second = 100 * 5;
            third = first - 100;
            fourth = 100 * 7;
            fifth = third - 100;
            sixth = 100 * 10;
            seven = fifth * 15;
            result = second + fourth + sixth + seven ;
            System.out.println("Your Electricity Bill is Rs : "+result);
        }else if(unit >= 400 && unit <= 500){
            first = unit - 100;
            second = 100 * 5;
            third = first - 100;
            fourth = 100 * 7;
            fifth = third - 100;
            sixth = 100 * 10;
            seven = fifth - 100;
            eight = 100 * 15;
            nine = seven * 20;
            result = second + fourth + sixth + eight + nine ;
            System.out.println("Your Electricity Bill is Rs : "+result);
        }
    }
}