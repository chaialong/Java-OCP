package interview.aop.static_proxy;

public class Test {
    public static void main(String[] args) {
        IHello hello = new ProxyHello(new Hello());
        hello.sayHello("world");
    }
}
