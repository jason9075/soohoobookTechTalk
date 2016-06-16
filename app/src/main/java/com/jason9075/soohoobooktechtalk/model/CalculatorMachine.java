package com.jason9075.soohoobooktechtalk.model;

/**
 * Created by jason9075 on 2016/6/16.
 */

public class CalculatorMachine {

    public CalculatorMachine() {
    }

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(double a, double b){
        return (int) (a+b);
    }
}
