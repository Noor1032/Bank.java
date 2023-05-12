import java.security.KeyStore;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        System.out.println("1. Money Counter \n2. Claculator \n3.trolly loader \n4.Exit");
        Scanner scan = new Scanner(System.in);
        String yesno;
        int any = scan.nextInt();
    do{
            switch (any) {

                case 1:

                   // do {

                        int total_money, five1000s, one1000s, five100s, one100, fifties, twenties, tens, fives, twos, ones;
                        System.out.println("Enter money : ");

                        total_money = scan.nextInt();

                        System.out.println("Total money is = " + total_money);

                        five1000s = total_money / 5000;
                        total_money = total_money % 5000;

                        one1000s = total_money / 1000;
                        total_money = total_money % 1000;

                        five100s = total_money / 500;
                        total_money = total_money % 500;

                        one100 = total_money / 100;
                        total_money = total_money % 100;

                        fifties = total_money / 50;
                        total_money = total_money % 50;

                        twenties = total_money / 20;
                        total_money = total_money % 20;

                        tens = total_money / 10;
                        total_money = total_money % 10;

                        fives = total_money / 5;
                        total_money = total_money % 5;

                        twos = total_money / 2;
                        ones = total_money % 2;

                        System.out.println("\n Five Thousands: " + five1000s + "\n one Thousands: " + one1000s
                                + "\n Five Hundreds: " + five100s + "\n one Hundreds: " + one100 + "\n Fifties: " + fifties
                                + "\n Twenties: " + twenties + "\n Tens: " + tens + "\nFives: " + fives + "\n Twos: " + twos
                                + "\n Ones: " + ones);

                        yesno = "N";
                 //   } while (yesno.equals("y") || yesno.equals("Y"));

                case 2:

                   // do {

                        int num = scan.nextInt();
                        int num2 = scan.nextInt();
                        int result;
                        //String operator = scan.next();
                        System.out.println("Choose Any Operator : +,-,*,/ ");
                        String operator = scan.next();
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
                                break;
                        }
                      //  System.out.println("If you want to continue press y");
                        yesno = "N";
                //    } while (yesno.equals("y") || yesno.equals("Y"));

                case 3:

                    //do {

                        int Total, driver, tax10, diesel, profit;
                        System.out.println("Enter trolly counter: ");
                        int trolly = scan.nextInt();

                        Total = 800 * trolly;
                        driver = 150 * trolly;
                        tax10 = Total * 10 / 100;
                        diesel = 200 * trolly;

                        System.out.println(tax10);

                        profit = Total - driver - tax10 - diesel;

                        System.out.println(" \n Enter trolly = " + trolly + " \n total = " + Total + " \n Driver = "
                                + driver + " \n Tax 10% = " + tax10 + " \n Diesel = " + diesel + "\n-------------"
                                + " \n Profit = " + profit);
                        yesno = "N";
                    //} while (yesno.equals("Y") || yesno.equals("y"));

                case 4:
                    scan.close();

            }
            yesno = "N";
        }while(yesno.equals("Y")||yesno.equals("y"));
    }
}
