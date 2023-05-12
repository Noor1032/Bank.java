public class salary {
    public static void main(String [] args){
        int basic = 100;
        int house,medical,bonus,gross,incometax,convance;
        house = ((45 * basic) / 100) ;
        medical = ((15 * basic) / 100);
        bonus = ((5 * basic) / 100);
        gross = basic + house + medical + bonus;
        incometax = ((5 * basic) / 100);
        convance = ((8 * basic) / 100);
        double zakat = ((2.5 * basic) / 100);
        double net = gross - incometax - convance - zakat ;
        System.out.println("Basic Salary: "+basic);
        System.out.println("House Rent 45% : "+house);
        System.out.println("Medical Allowance 15% : "+medical);
        System.out.println("Bonus 5% : "+bonus);
        System.out.println("Gross Salary : "+gross);
        System.out.println("Income Tax : "+incometax);
        System.out.println("Convance Allowance 5% : "+convance);
        System.out.println("Zakat 2.5% : "+zakat);
        System.out.println("==================");
        System.out.println("Net Income : "+net);

    }
}

