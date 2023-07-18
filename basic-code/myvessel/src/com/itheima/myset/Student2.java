package com.itheima.myset;

public class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    private int chinese;
    private  int math;
    private int english;

    public Student2() {
    }

    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english+ ", sum = " + getSum() + "}";
    }
    private int getSum(){
        return getEnglish()+getChinese()+getMath();
    }


    @Override
    public int compareTo(Student2 o) {
        int i = o.getSum() - this.getSum();
        i = i == 0 ? o.getChinese() - this.getChinese() : i;
        i = i == 0 ? o.getMath() - this.getMath() : i;
        i = i == 0 ? o.getEnglish() - this.getEnglish() : i;
        i = i == 0 ? this.getAge() - o.getAge() : i;
        return i == 0 ? this.getName().compareTo(o.getName()) : i;
    }
}
