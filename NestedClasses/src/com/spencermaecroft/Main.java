package com.spencermaecroft;

public class Main {

    public static void main(String[] args) {

            NestedClass nc = new NestedClass("Spencer");
            NestedClass.InnerClass ic = nc.new InnerClass();
            NestedClass.StaticInnerClass sc = new NestedClass.StaticInnerClass();
            System.out.println(sc.getAge());

            ic.printName();
            ic.changeOuterName("Elise");
            ic.printName();
            System.out.println(ic.getAge());
            System.out.println(sc.getAge());

    }
}
