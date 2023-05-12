public class data {
    String name;
    int age;

    public static void main(String[] args) {
        data in = new data();
        in.insert("Noor Rasheed",20);
        in.display();
    }
    public void insert(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("My Name is : "+name);
        System.out.println("My age is : "+age);
    }
}