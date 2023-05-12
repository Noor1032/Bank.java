import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
        Scanner any = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = any.nextInt();
        System.out.println("Enter Number : ");
        int num2 = any.nextInt();
        System.out.println("Enter any operator : ");
        String operator = any.next();
        System.out.println("Choose Any Operator : +,-,*,/ ");
        int result;
        switch (operator) {
            case "+":
                result = num + num2;
                System.out.println(num + "+" + num2 + "=" + result);
                break;
            case "-":
                result = num - num2;
                System.out.println(num + "-" + num2 + "=" + result);
                break;
            case "*":
                result = num * num2;
                System.out.println(num + "*" + num2 + "=" + result);
                break;
            case "/":
                result = num / num2;
                System.out.println(num + "/" + num2 + "=" + result);
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }
}
