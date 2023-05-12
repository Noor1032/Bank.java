import java.util.Scanner;
public class Hallchari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int inp = scan.nextInt();

        for (int i = 1; i <= inp; i++) {

            if (i%5==0 && i%3==0){
                System.out.println("hal chari");
            }
            else if (i % 3 == 0) {
                    System.out.println("hal");

                } else if (i % 5 == 0) {
                    System.out.println("chari");

                } else {
                    System.out.println(i);
                }
            }


    }

}

