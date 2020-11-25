package com.objectorientedprogramming;

public class Constructors {
    private String model;
    private int currentSpeed;

    //constructors
    public Constructors(String model){
        this.model = model;
    }

    //methods
    public void start () {
        System.out.println(this.model + "has started");
    }
    public void accelerate () {
        this.currentSpeed += 20;
    }
    public void stop (){
        System.out.println(this.model + "has stopped");
        this.currentSpeed = 0;
    }


}
