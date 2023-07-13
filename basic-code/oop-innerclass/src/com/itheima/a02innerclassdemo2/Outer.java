package com.itheima.a02innerclassdemo2;

public class Outer {


    private class Inner {
static int a = 10;
    }

    public Inner getInstance(){
        return new Inner();
    }
}
