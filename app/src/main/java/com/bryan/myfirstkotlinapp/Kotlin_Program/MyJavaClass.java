package com.bryan.myfirstkotlinapp.Kotlin_Program;

public class MyJavaClass {

//    public static void add(int a, int b){
//        int result = a + b;
//        System.out.println("Printing inside Java Class: "+result);
//    }

    protected String fName;
    protected String lName;

    public String getfName(){
        return fName;
    }

    public void setfName(String firstName){
        this.fName = firstName;
    }

    public String getlName(){
        return lName;
    }

    public void setlName(String lastName){
        this.lName = lastName;
    }
}
