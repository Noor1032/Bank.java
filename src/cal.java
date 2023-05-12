import java.util.Scanner;
public class cal {
    int num;
    int num2;
    int result;
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String operator = ob.nextLine();
        cal op = new cal();
        //System.out.println("Enter Number : "+op.num);
        op.num = 10;
        //System.out.println("Enter Number : "+op.num2);
        op.num2 = 20;
        switch (operator){
            case "+":
            op.result = (op.num + op.num2);
                System.out.println(op.result);
            break;
            case "-":
                op.result = (op.num - op.num2);
                System.out.println(op.result);
                break;
            case "*":
                op.result = (op.num * op.num2);
                System.out.println(op.result);
                break;
            case "/":
                op.result = (op.num / op.num2);
                System.out.println(op.result);
                break;
        }
    }
}