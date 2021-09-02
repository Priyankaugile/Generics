package com.generics;

public class MaximumNumberWithFloat {
    //returns the maximum value of three floats
    public static Float findMax(Float m, Float n, Float o) {
        Float max = m;
        if(n.compareTo(max)> 0)
            max = n;
        if(o.compareTo(max)>0)
            max = o;
        System.out.printf("The max of three numbers %s %s %s is : %s \n",m,n,o,max);
        return max;
    }
    public static void main(String[] args) {
        //TC1.1 maximum number at first
        Float float1 = 3.45f, float2 = 45.30f,float3 = 87.6f;
        Float max = findMax(float1,float2,float3);

        //TC1.2 maximum number at second
        Float float4 = 23.0f,float5 = 98.98f,float6 = 4876.76f;
        float max1 = findMax(float4,float5,float6);

        //TC1.3 maximum number at third
        Float float7 = 36.56f,float8 = 73.65f,float9 = 42.06f;
        float max2 = findMax(float7,float8,float9);
    }
}

