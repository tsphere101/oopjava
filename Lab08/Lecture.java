public class Lecture {

    public static void main(String[] args) {

        A something = new A();

        A your_mom = new B();

        B your_father = new B();

        your_father = (A)your_father;

    }

    static void method(B a) {
        a.callName();
    }

}

class A {
    String name = "";

    public A() {
    }

    public void callName() {
        System.out.println("THIS IS From CLASS A NAME::" + this.name);
    }

}

class B extends A {

    String name = "A DEFAULT NAME";

    @Override
    public void callName() {
        System.out.println("THIS IS From CLASS B NAME::" + this.name);
    }

    public void callSuper() {
        super.callName();
    }
}

class C extends B {
    String name = " B DEFAULT NAME";

    @Override
    public void callName() {
        System.out.println("This is from class C ");
    }
}