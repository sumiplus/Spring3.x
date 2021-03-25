package dynamicproxy;

import java.lang.reflect.Proxy;

public class HelloMain {

    public static void main(String[] args) {

        Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[]{Hello.class}, new LogInvocationHandler(new HelloImpl()));
        hello.sayHello(" I love you!!!");
    }
}
