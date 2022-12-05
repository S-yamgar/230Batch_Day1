package com.day1problem.homework;

public class PrimitiveDataTypeDefaultValueP2 {
        int a ;
        short b;
        byte c;
        long d;
        float f;
        double g;
        char h;
        boolean i;

    public static void main(String[] args) {
        //create obj and pass the instance variable
        PrimitiveDataTypeDefaultValueP2 value = new PrimitiveDataTypeDefaultValueP2();

        System.out.println("int default is : " + value.a );
        System.out.println("short default is :" + value.b );
        System.out.println("byte default is :" + value.c );
        System.out.println("long default is :" + value.d );
        System.out.println("float default is :" + value.f );
        System.out.println("double default is :" + value.g );
        System.out.println("char default is :" + value.h );
        System.out.println("boolean default is :" + value.i );

    }
}
