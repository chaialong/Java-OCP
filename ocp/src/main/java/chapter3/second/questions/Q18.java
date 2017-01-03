package chapter3.second.questions;

public class Q18 {
    class A {}
    class B extends A {}
    class C extends B {}

    class D<C> {
        A a1 = new A();
        A a2 = new B();
//        A a3 = new C();
    }
}
