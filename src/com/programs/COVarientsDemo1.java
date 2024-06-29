package com.programs;

class SuperClass{
    Long get() {

        return (long) 2;
    }
}

public class COVarientsDemo1 extends SuperClass{
    //@Override
    /*Integer get() {

        return  1;
    }*/


    public static void main(String[] args) {
        COVarientsDemo1 s1 = new COVarientsDemo1();
        System.out.println(s1.get());

    }

}

