package com.spencermaecroft;

public class NestedClass {
    private String name;
    private int salary;
    private static int age = 22;


    public NestedClass(String name){
        this.name = name;
    }

    private void changeName(String name){
        this.name = name;
    }

    public int getSalary(){
        return this.salary;
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

        public void setSalary(int salary){
            NestedClass.this.salary = salary;
        }
    }

    static class StaticInnerClass{
        private int salary;

        public void setSalary(int salary){
            this.salary = salary;
        }

        public int getSalary(){
            return this.salary;
        }
        public int getAge(){
            return age;
        }
    }
}
