import java.util.Scanner;

public class  Mix{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String question;



        while (true) {

            System.out.println(
                    "What do you want to do?\n choose option below: \n1. Money Counter\n2. Basic pay\n3.trolly loader\n4.Even, odd +ve,-ve and zero identifier\n5.blood donation\n6.Days divisor");
            // String Question = scan.nextLine();
            question = scan.next();
            // scan.nextInt();

            switch (question) {

                case "1":
                    int total_money, five1000s, one1000s, five100s, one100, fifties, twenties, tens, fives, twos, ones;
                    System.out.println("Enter money: ");
                    // Scanner scan = new Scanner (System.in);

                    total_money = scan.nextInt();

                    System.out.println("Total money is= " + total_money);

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
                    break;

                case "2":
                    int basic_pay, house_rent45per, medical_allowence15per, bonus5, gross_pay, incom_tax5,
                            convance_allowance8;

                    basic_pay = 20000;

                    // basic_pay = 20000;

                    house_rent45per = basic_pay * 45 / 100;

                    medical_allowence15per = basic_pay * 15 / 100;
                    bonus5 = basic_pay * 5 / 100;

                    gross_pay = basic_pay + house_rent45per + medical_allowence15per + bonus5;

                    incom_tax5 = basic_pay * 5 / 100;

                    convance_allowance8 = basic_pay * 8 / 100;

                    double zakwat_dhai = basic_pay * 2.5 / 100d;

                    double net_incom = gross_pay - incom_tax5 - convance_allowance8 - zakwat_dhai;

                    System.out.println("\n Enter basic pay = " + basic_pay +
                            "\n HouseRent 45%== " + house_rent45per + "\n MedicalAllowance15%= "
                            + medical_allowence15per + "\n Bonus 5% = " + bonus5 + "\n GrossPay = " + gross_pay
                            + "\n IncomeTax 5% = " + incom_tax5 + "\n ConvanceAllowance 8% = " + convance_allowance8
                            + "\n Zukwat 2.5% = " + zakwat_dhai + "\n====================" + "\n Net Income = "
                            + net_incom);

                    break;
                case "3":
                    int Total, driver, tax10, diesel, profit;
                    System.out.println("Enter trolly counter: ");
                    int trolly = scan.nextInt();

                    // trolly = 4;
                    Total = 800 * trolly;
                    driver = 150 * trolly;
                    tax10 = Total * 10 / 100;
                    diesel = 200 * trolly;

                    System.out.println(tax10);

                    profit = Total - driver - tax10 - diesel;

                    System.out.println(" \n Enter trolly = " + trolly + " \n total = " + Total + " \n Driver = "
                            + driver + " \n Tax 10% = " + tax10 + " \n Diesel = " + diesel + "\n-------------"
                            + " \n Profit = " + profit);

                case "4":

                    System.out.println("Enter number: ");

                    int number = scan.nextInt();

                    if (number > 0) {
                        System.out.println("Number is =  Positive");
                    }

                    else if (number < 0) {
                        System.out.println("Number is =Negative");
                    }

                    if (number % 2 == 0) {
                        if (number == 0) {
                            System.out.println("Number is = Zero");
                        } else {
                            System.out.println("Number is = Even");
                        }
                    } else {

                        System.out.println("Number is = ODD");
                    }

                    break;

                case "5":

                    System.out.println(
                            "Enter age and weight respectively to know that re you eligible or not for blood donation ");

                    int Age = scan.nextInt();
                    int weight = scan.nextInt();

                    if (Age > 18 && weight > 70 && weight < 300) {

                        System.out.println("You can donate blood");
                    } else {

                        System.out.println("Sorry You cann't donate blood");
                    }
                    break;

                case "6":
                    System.out.println(
                            "enter number of days to know amount of years, months, weeks, and remaining days: ");

                    int day = scan.nextInt();

                    int years, months, week, days;
                    // int day = 730;
                    int total = day;

                    years = day / 365;
                    day = day % 365;

                    months = day / 30;
                    day = day % 30;
                    week = day / 7;

                    day = day % 7;

                    days = day;

                    System.out.println("total days = " + total + "\n Years = " + years + "\n Months = " + months
                            + "\n weeks = " + week + "\n remaining days = " + days);

                    break;


            }

        }

    }
}