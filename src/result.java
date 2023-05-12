import java.util.Scanner;
public class result {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println("What is your email?");
        String email = sc.nextLine();
        email = sc.nextLine();
        System.out.println("What is your Address?");
        String address = sc.nextLine();
        System.out.println("What is your Basic Salary?");
        double salary = sc.nextDouble();
        System.out.println("Your name is : "+name);
        System.out.println("Your age is : "+age);
        System.out.println("Enter your Email : "+email);
        System.out.println("Your Address is : "+address);
        System.out.println("Enter your salary : "+salary);
        sc.close();
    }
}
