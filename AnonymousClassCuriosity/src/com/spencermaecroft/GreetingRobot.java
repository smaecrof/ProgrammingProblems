package com.spencermaecroft;

public class GreetingRobot implements Hello {

    public void sayHello(){
        System.out.println("Hello there :)");
        System.out.println("How are you today");
    }

    public void sayGreeting(String nameToGreet){
        System.out.println("Hello there " + nameToGreet + ", my name is Jarvis");
        System.out.println("How did you find me in this computer?");
    }


    public void greetInSpanish(String name){
        Hello spanishGreeting = new Hello(){

            public void sayHello(){
                System.out.println("Hola mi padre");
            }

            public void sayGreeting(String name){
                System.out.println("Hola, " + name);
            }
        };

        spanishGreeting.sayHello();
        spanishGreeting.sayGreeting(name);
    }

}
