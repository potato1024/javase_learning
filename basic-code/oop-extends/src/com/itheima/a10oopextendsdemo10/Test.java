package com.itheima.a10oopextendsdemo10;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("heima001", "zhangsan", 15000, 8000);
        System.out.println(m.getId() + ", " + m.getName() + ", " + m.getSalary() + ", " + m.getBouns());
        m.work();
        m.eat();

        Cook c = new Cook("heima002", "lisi", 4000);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());
        c.work();
        c.eat();

    }
}
