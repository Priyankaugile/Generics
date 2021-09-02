package com.generics;

import java.util.Scanner;

public class MaximumNumberWithString {
   //returns the max string name of three strings

   public static String findMax(String m, String n, String o) {
       String max = m;
       if(n.compareTo(max)> 0)
           max = n;
       if(o.compareTo(max)>0)
           max = o;
       System.out.printf("The max of three numbers %s %s %s is : %s \n",m,n,o,max);
       return max;
   }
    public static void main(String[] args) {
        //TC1.1 maximum string name at first
        String String1 = "Apple", String2 = "Google",String3 = "Microsoft";
        String max1 = findMax(String1,String2,String3);

        //TC1.2 maximum string name  at second
        String String4 = "iphone", String5 = "Amazon",String6 = "Royal";
        String max2 = findMax(String4,String5,String6);

        //TC1.3 maximum string name at third
        String String7 = "Hathaway", String8 = "Dollar",String9 = "phone";
        String max3 = findMax(String7,String8,String9);
    }
}


