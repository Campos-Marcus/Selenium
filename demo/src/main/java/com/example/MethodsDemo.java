package com.example;

import com.MethodsDemo2;

public class MethodsDemo {
    public static void main(String[] args) {
        MethodsDemo d = new MethodsDemo();
        d.getData();

        System.out.println(d.returnInt());

        MethodsDemo2 d2 = new MethodsDemo2();

        d2.getData();

        getInfoRandom();
        
    }

    public static void getInfoRandom(){
        System.out.println("this is a static function");
    }

    public void getData(){
        System.out.println("hello world");
    }

    public Integer returnInt () {
        return 5;
    }
}
