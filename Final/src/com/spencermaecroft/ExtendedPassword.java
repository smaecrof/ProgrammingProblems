package com.spencermaecroft;

public class ExtendedPassword extends Password{

    private int decryptedPassword;

    public ExtendedPassword(int password){
        super(password);
        this.decryptedPassword = password;
    }

}
