package com.sumi;

public class Main {

    public static void main(String[] args) {
        new AClass();
    }
}

class A {

    public A() {
        new B();
    }
}

class B {
    public B() {
        new AClass();
    }
}

