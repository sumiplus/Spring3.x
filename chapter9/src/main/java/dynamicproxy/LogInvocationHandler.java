package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LogInvocationHandler implements InvocationHandler {

    private Hello hello;

    public LogInvocationHandler(Hello hello) {
        this.hello = hello;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("log start");
        if ("sayHello".equals(method.getName())) {
            System.out.println("param:" + Arrays.toString(args));
        }
        return method.invoke(hello, args);
    }
}
