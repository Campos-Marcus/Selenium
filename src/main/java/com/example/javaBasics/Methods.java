package com.example.javaBasics;


public class Methods {
    public static void main(String[] args) {
        
        Methods d = new Methods();
        String name = d.getData();
        System.out.println(name);

        Methods2 d2 = new Methods2();
        d2.getUserData();

    }

    public String getData(){
        System.out.println("hello world");
        return "test123";
    }

    /*If method is written like public string get data, we need to intanciate object and get it
    string name = d.getData();
    however, if they have the STATIC, no:
    string name = getData();
     * 
     * 
     */
}
