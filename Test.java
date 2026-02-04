class A {
    A() {
        System.out.println("Class A constructor");
    }
}

class B extends A {
    B() {
        super();   
        super();   
    }
}

public class Test {
    public static void main(String[] args) {
        B obj = new B();
    }
}
w