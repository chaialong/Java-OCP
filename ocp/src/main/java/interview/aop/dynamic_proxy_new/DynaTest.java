package interview.aop.dynamic_proxy_new;

public class DynaTest {
    public static void main(String[] args) {
        IHello hello = (IHello) new DynaProxyHello().bind(new Hello(), new DLogger());

        hello.sayHello("world");
    }
}
