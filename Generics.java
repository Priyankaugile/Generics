package com.generics;

public class Refactore1 {
    // method extends comparable and returns max value
    public static <T extends Comparable<T>> T findMax (T[] some_Array){

        T max = some_Array[0];
        for(T t : some_Array){
            if(t.compareTo(max)>0)
                max = t;
        }
        return max;
    }

    public static void main(String[] args) {

        Integer[] array_Of_Integer = {47,20,98};
        Float[] array_Of_Floats = {23.65f,96.42f,44.07f};
        String[] array_Of_Strings = {"apple","Peach","banana"};

        Integer max_Of_Three_Integer = findMax(array_Of_Integer);
        System.out.println("The maximum value of three integers is : "+max_Of_Three_Integer);

        Float  max_Of_Three_Floats = findMax(array_Of_Floats);
        System.out.println("The maximum value of three floats is : "+max_Of_Three_Floats);

        String max_Of_Three_Strings = findMax(array_Of_Strings);
        System.out.println("The maximum value of three strings is : "+max_Of_Three_Strings);

    }
}


