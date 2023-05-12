public class Trolly_load{
    public static void main(String [] args){
        int trollyload = 5;
        System.out.println("Number of Trolly : "+trollyload);
        int total , driver , tax , diesel , sum , profit ;
        total = trollyload * 800 ;
        driver = trollyload * 150 ;
        tax = ((10 * total) / 100) ;
        diesel = trollyload * 200 ;
        sum = driver + tax + diesel ;
        profit = total - sum ;
        System.out.println("Total Trolly Load : "+total);
        System.out.println("Driver Expense : "+driver);
        System.out.println("Tax Deduction : "+tax);
        System.out.println("Diesel Expense : "+diesel);
        System.out.println("Profit is : "+profit);


    }
}