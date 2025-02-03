package com.example.javaBasics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

    public static void main(String[] args) {
        int[] arr2 = {1,2,3,4,5,6};

        for(int i = 0; i < arr2.length; i++){

            if(arr2[i]% 2 == 0){
                System.out.println(arr2[i]+ " is multiple of 2");
            }

        }
        //arraylist

        //ArrayList <String>a = new ArrayList<String>();
        //arraylist = dinamically change the amount of elements, without having to allocate memory like static declaraions, etc...
        //also leverage many functions that deals with arrays, so important to note the difference, and the conversion as well
        List <String>a = new ArrayList<String>();

        a.add("test");
        a.add("test2");
        System.out.println(a.get(1));

        System.out.println(a.get(0));
        //i fyou want to use that class, you need to create an object of that class
        // good for dinamically adding data

        for(String val : a){
            System.err.println(val);
        }

        //item is present in array
        System.out.println(a.contains("test"));

        System.out.println(a.indexOf("test2"));


        String[] name = {"Thales", "Marcus", "teste", "teste9"};
        List<String> nameArrayList = Arrays.asList(name);   
        nameArrayList.contains("Marcus");   
    }
}
