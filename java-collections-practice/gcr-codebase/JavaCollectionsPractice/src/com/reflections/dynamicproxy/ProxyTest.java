package com.reflections.dynamicproxy;
public class ProxyTest {

    public static void main(String[] args) {

        Greeting greeting = new GreetingImpl();
        Greeting proxy = (Greeting) LoggingProxy.createProxy(greeting);

        proxy.sayHello();
    }
}