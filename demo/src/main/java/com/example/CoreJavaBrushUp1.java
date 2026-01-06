package com.example;

public class CoreJavaBrushUp1 {
    public static void main(String[] args) {
        
        int myNum = 5;
        String website = "Marcus test";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;

        System.out.println(myNum +" is the value stored in mynumVariable");

        //arrays
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6; 

        int [] arr2 =  {1,2,4,5,6};

        System.out.println(arr2[3]);


        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        String [] name  = {"test", "123test"};
    }

}
  