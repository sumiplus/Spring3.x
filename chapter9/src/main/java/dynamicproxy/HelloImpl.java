package dynamicproxy;

public class HelloImpl implements Hello {
    public void sayHello(String param) {
        System.out.println("Hello word!!!" + param);
    }
}
