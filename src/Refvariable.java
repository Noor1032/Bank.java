public class Refvariable {
    String name;
    String adress;
    String district;
    String nationality;
    int age;
    public static void main(String [] args){
        Refvariable e1 = new Refvariable();
        e1.name = "Noor Rasheed";
        e1.age = 20;
        e1.adress = "Gulshan e Anwar Tando Adam";
        e1.nationality = "Pakistani";
        e1.district = "Sanghar";
        System.out.println("My Name is : "+e1.name);
        System.out.println("My Age is : "+e1.age);
        System.out.println("Address is : "+e1.adress);
        System.out.println("Nationality : "+e1.nationality);
        System.out.println("District : "+e1.district);
    }
}
