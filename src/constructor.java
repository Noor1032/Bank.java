public class constructor {
    String name;
    int age;
    String cont;
    String adress;
    public static void main(String [] args){
        constructor sc = new constructor("Noor Rasheed",20,"03332881120","Gulshan e Anwar Near Bara Pir Tando Adam");

    }
    public constructor(String name,int age,String cont,String adress){
        this.name=name;
        this.age=age;
        this.cont=cont;
        this.adress=adress;
        System.out.println("My name is : "+name);
        System.out.println("My age is : "+age);
        System.out.println("My contact number is : "+cont);
        System.out.println("My address is : "+adress);
    }
}
