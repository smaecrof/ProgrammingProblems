package com.spencermaecroft;

public class NestedClass {
    private String name;
    private static int age = 22;


    public NestedClass(String name){
        this.name = name;
    }

    private void changeName(String name){
        this.name = name;
    }

    class InnerClass{
        public void printName(){
            System.out.println(name);
        }

        public void changeOuterName(String name){
            NestedClass.this.changeName(name);
        }

        public int getAge(){
            return age;
        }
    }

    static class StaticInnerClass{
        public int getAge(){
            return age;
        }
    }
}
