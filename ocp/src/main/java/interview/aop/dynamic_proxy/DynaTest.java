package interview.aop.dynamic_proxy;

public class DynaTest {
    public static void main(String[] args) {
        IHello hello = (IHello) new DynaProxyHello().bind(new Hello());

        hello.sayHello("world");
    }
}
