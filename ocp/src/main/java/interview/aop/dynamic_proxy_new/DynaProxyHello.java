package interview.aop.dynamic_proxy_new;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxyHello implements InvocationHandler {
    private Object proxy;

    private Object target;

    public Object bind(Object target, Object proxy) {
        this.target = target;
        this.proxy = proxy;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),
                this.target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;

        Class clazz = this.proxy.getClass();
        Method start = clazz.getDeclaredMethod("start", Method.class);
        start.invoke(this.proxy, method);
        method.invoke(this.target, args);
        Method end = clazz.getDeclaredMethod("end", Method.class);
        end.invoke(this.proxy, method);
        return result;
    }
}
