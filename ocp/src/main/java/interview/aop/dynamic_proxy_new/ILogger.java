package interview.aop.dynamic_proxy_new;

import java.lang.reflect.Method;

public interface ILogger {
    void start(Method method);

    void end(Method end);
}
