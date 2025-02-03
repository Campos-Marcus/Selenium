package com.example.javaBasics;



public class CoreJavaBrushUp1 {
    public static void main(String[] args) {
        int myNum  = 5;
        String website = "www.google.com";
        char letter = 'r';
        double dec = 9.231;
        boolean mycard = true;
        
        System.out.println(myNum + "!!!");
        System.out.println(website);


        //arrays

        int[] arrNumbers = new int[5];
        arrNumbers[0] = 1;
        arrNumbers[1] = 2;

        int[] arr2 = {1,2,3,4,5,6};

        //for looop

        for(int i = 0; i< arr2.length; i++){
            System.out.println(arr2[i]);
        }

        String[] name = {"Marcus", "campos"};
        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }

        //can be ehanced into

        for(String s:name){
            System.out.println(s+"Enhanced FOR");
        }

            
    System.out.println(arrNumbers[0]);

    }

}
