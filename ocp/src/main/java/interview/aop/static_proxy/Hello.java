package interview.aop.static_proxy;

public class Hello implements IHello {
    @Override
    public void sayHello(String str) {
        System.out.println("hello " + str);
    }
}
