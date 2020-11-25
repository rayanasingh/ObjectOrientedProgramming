package com.constructorstest;

import com.objectorientedprogramming.Constructors;

public class ConstructorsTest {
    public static void main(String[] args) {
        Constructors myCar = new Constructors("Ferrari");
        myCar.accelerate();
        myCar.start();
        myCar.stop();
    }
}
