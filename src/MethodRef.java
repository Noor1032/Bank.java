public class MethodRef {
    String name;
    int age;
    String dist;
    String add;
    public static void main(String [] args){
        MethodRef e1 = new MethodRef();
        e1.insertData("Noor Rasheed",20,"Gulshan e Anwar Tando Adam","Sanghar");
        e1.display();

    }
    public void insertData(String n,int a,String ad,String dis){
        name = n;
        age = a;
        add = ad;
        dist = dis;
    }
    void display(){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("Address is : "+add);
        System.out.println("District is : "+dist);
    }
}
