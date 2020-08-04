package com.spencermaecroft;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck(){
        System.out.println("ScopeCkeck created, publicVar = " + publicVar + ": varOne = " + varOne);
    }

    public int getVarOne(){
        return this.varOne;
    }

    public void timesTwo(){
        int varTwo = 2;
        for(int i = 0; i < 10; i++){
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
        System.out.println("varFive from outer class: " + innerClass.varFive);
        System.out.println("varSix from outer class: " + innerClass.varSix);
    }

    public class InnerClass{
        public int varThree = 3;
        private int varFive = 5;
        protected int varSix = 6;

        public InnerClass(){
            System.out.println("InnerClass created, varOne is " + varOne + " varThree is " + varThree);
        }

        public void timesTwo(){
            System.out.println("varOne is still available here " + varOne);
            for(int i = 0; i < 10; i++){
                System.out.println(i + " times two is " + i * varThree);
            }
        }
    }
}
