package com.booleanuk.extension;

public class Extension {
    public String[] fizzbuzz(int lower, int higher) {
        /* TODO: Implement a function that will create a list of strings containing the numbers from the lower number to the higher number
            Where a number is a multiple of three (3, 6, 9, etc) the array should contain the string "Fizz" instead of a number.
            Where a number is a multiple of five (5, 10, etc) the array should contain the string "Buzz" instead of a number.
            Where a number is a multiple of both five AND three (15, 30, etc) the array should contain the string "Fizzbuzz" instead of a number.
        * */


        String[] lis = new String[higher-lower+1];

        for (int n = 0; n < lis.length; n++) {
            lis[n] = Integer.toString(n+lower);
        }

        for (int n = 0; n < lis.length; n++) {
            if (Integer.parseInt(lis[n]) %3==0 && Integer.parseInt(lis[n]) %5==0){
                lis[n] = "Fizzbuzz";
            }
            else if (Integer.parseInt(lis[n]) %3==0){
                lis[n] = "Fizz";
            }

            else if (Integer.parseInt(lis[n]) %5==0){
                lis[n] = "Buzz";
            }
        }

        return lis;
    }
}
