package com.generics;

public class MaximumNumber {
    //returns the maximum value of three integer.
    public static Integer findmax(Integer p, Integer q, Integer r){
        Integer max = p;
        if(q.compareTo(max)>0)
            max = q;
        if (r.compareTo(max)>0)
            max = r;
        System.out.printf("The maximum of three numbers %s %s %s is : %s \n",p,q,r,max);
        return max;
    }

    public static void main(String[] args) {
        //tc1.1 maximum number at first.
        Integer int1 = 20, int2 = 31, int3 = 47;
        Integer max1 = findmax(int1,int2,int3);

        //tc1.2 maximum number at second.
        Integer int4 = 71,int5 = 84, int6 = 91;
        Integer max2 = findmax(int4,int5,int6);

        //tc1.3 maximum number at third.
        Integer int7 = 55, int8 = 11, int9 = 78;
        Integer max3 = findmax(int7,int8,int9);
    }

}

