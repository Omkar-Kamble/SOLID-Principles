package com.example.Lesson3_AbstractClasses_And_Interfaces.Interfaces;


interface A{
    default void doSome(){
        System.out.println("A");
    }
}
interface B{
    default void doSome(){
        System.out.println("B");
    }
}

class C implements A,B{
    @Override
    public void doSome(){
        A.super.doSome();
    }
}
public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.doSome();
    }
}
