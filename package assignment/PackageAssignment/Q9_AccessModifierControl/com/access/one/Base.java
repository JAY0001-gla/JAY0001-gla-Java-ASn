package com.access.one;
public class Base {
    public void publicMethod(){ System.out.println("public"); }
    protected void protectedMethod(){ System.out.println("protected"); }
    void defaultMethod(){ System.out.println("default"); }
    private void privateMethod(){ System.out.println("private"); }
    public void callAll(){ 
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
