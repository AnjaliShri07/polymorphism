package com.programs;

class One{
    public static void print(){
        System.out.println("1");
    }
}

class Two extends One{
    public static void print(){
        System.out.println("2");
    }
}

public class PolyDemo2{
    public static void main(String args[]){
        One one = new Two();
        one.print();
        Two two = new Two();
        two.print();
    }
}
