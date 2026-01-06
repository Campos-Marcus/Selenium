package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {
        
        int [] arr2 = {1,3,5,5,4,4};


        for (int i = 0; i <arr2.length; i++){
            if(arr2[i] % 2 ==0){
                System.out.println(arr2[i]);
                break;
            }
            else{
                System.out.println(arr2[i] + " is not multiple of 2");
            }
        }

        ArrayList<String> a = new ArrayList<>();
        a.add("test");
        a.add("aloha");
        String test = a.get(1);

        System.out.println(test);

        //normal array, length, if it's arraylist, use size
        for (int o = 0; o< a.size(); o++){
            System.out.println(a.get(o));
        }

        System.out.println("*****");
        for (String val: a){
            System.out.println(val);
        }

        System.out.println(a.contains("aloha"));

        //convert a normal array to arraylist, so can leverage the many methods it supports
        String [] name2  = {"test", "123test", "test9878a", "tepsápaaasd"};
        List <String> name2ArrayList = Arrays.asList(name2);

        System.out.println(name2ArrayList.contains(name2ArrayList));
        //create object of the class  - object.method
    }
}
