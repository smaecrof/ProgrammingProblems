package com.spencermaecroft;

/**
 * Created by SMC on 08/04/2020
 */

// CHALLENGE
// In the following interface declaration, what is the visibility of:
//
// 1) The Accessible Interface?
//  - PACKAGE_PRIVATE; Objects are only available within its own package
// 2) The int variable SOME_CONSTANT?
//  - public static final ; only available within its own package
// 3) methodA()?
//  - public and they are visible to all classes anywhere
// 4) methodB() and methodC()?
//  - public; All interface methods are automatically public



interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}
