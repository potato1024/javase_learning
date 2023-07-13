package com.itheima.a01innerclassdemo1;

public class Car {
    String carName;
    int carAge;
    String carColor;


    public void show(){
        System.out.println(carAge);
        Engine e = new Engine();

        System.out.println(e.engineAge);

   }
    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineAge);
            System.out.println(carName);
        }
    }
}
