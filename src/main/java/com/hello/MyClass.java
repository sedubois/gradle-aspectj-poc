package com.hello;

public class MyClass {
    public void foo (int number, String name) {
        System.out.println("Inside foo (int, String) >>> number : " + number + ", name : " + name);
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.foo(1, "Russ Miles");
    }
}
