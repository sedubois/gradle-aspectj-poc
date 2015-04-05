package com.hello;

public class MyClass {

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.foo(1, "Russ Miles");
    }

    public void foo (int number, String name) {
        System.out.println("Inside foo (int, String) >>> number : " + number + ", name : " + name);
    }
}
