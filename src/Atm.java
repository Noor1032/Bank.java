import java.util.Scanner;
public class Atm {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String fd;

        do {
            System.out.println("Enter Your Account Balance : ");
            int balance = sc.nextInt();
            System.out.println("Welcome To MCB ATM Service \n What would you want to do? \n1.Cash Withdrawl \n2.Cash Deposit \n3.Balance Inquiry \n4.Exit ");
            int fund = sc.nextInt();
            switch (fund) {
                case 1:
                    System.out.println("Enter Money : ");
                    int cash = sc.nextInt();
                    if (balance >= cash) {
                        balance = balance - cash;
                        System.out.println("Collect your Amount");
                        System.out.println("Thanks For Using");
                    } else {
                        System.out.println("You'r Balance is Insufficient");
                    }
                    break;

                case 2:

                    System.out.println("Enter Amount For Deposit : ");
                    int deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Thanks For Deposit Your Amount" + balance);
                    break;

                case 3:

                    System.out.println("Your Account Balance is : " + balance);
                    System.out.println("Thank you for Using");
                    break;

                case 4:

                    System.exit(0);

            }
            System.out.println("For Continue Type Y");
         fd = sc.next()  ;
        }while(fd.equalsIgnoreCase("y"));
        System.out.println();

    }
}
