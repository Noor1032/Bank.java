public class A {
    public void showA(){
        System.out.println("Class A showA");
    }
}

class B extends A {
    public void showB(){
        System.out.println("Class b showb");
    }
}

class C extends B {
    public void showC(){
        System.out.println("Class c showc");
    }

    public static void main(String[] args) {
        A ob1 = new A();
        ob1.showA();
//        ob1.showB();
//        ob1.showC();

        B ob2 = new B();
        ob2.showA();
        ob2.showB();
//        ob2.showC();

        C ob3 = new C();
        ob3.showC();
        ob3.showA();
        ob3.showB();
    }
}
