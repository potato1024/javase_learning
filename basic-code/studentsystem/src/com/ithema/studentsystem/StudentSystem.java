package com.ithema.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String SELECT_STUDENT = "4";
    private static final String EXIT = "5";

    static ArrayList<Student> list = new ArrayList<>();
    static {
        list.add(new Student("heima001", "zhangsan", 23, "beijing"));
        list.add(new Student("heima002", "lisi", 24, "shanghai"));
        list.add(new Student("heima003", "wangwu", 25, "shenzhen"));
    }




    public void start(){

        loop:
        while (true) {
            System.out.println("-----------the best student system-----------------");
            System.out.println("1: create a student");
            System.out.println("2: delete a student");
            System.out.println("3: update a student");
            System.out.println("4: select a student");
            System.out.println("5: exit");
            System.out.println("input your choose: ");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case ADD_STUDENT -> addStudent(list);
                case DELETE_STUDENT -> deleteStudent(list);
                case UPDATE_STUDENT -> updateStudent(list);
                case SELECT_STUDENT -> selectStudent(list);
                case EXIT -> {
                    System.out.println("exit");
                    break loop;
                    //System.exit(0);
                }
                default -> System.out.println("no choose");
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        //System.out.println("addStudent");
        Scanner sc = new Scanner(System.in);
        String id = null;
        System.out.println("please input id: ");
        while (true) {
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("id already exists! please re-enter: ");
            } else {
                break;
            }
        }
        System.out.println("please input name: ");
        String name = sc.next();
        System.out.println("please input age: ");
        int age = sc.nextInt();
        System.out.println("please input address: ");
        String address = sc.next();

        Student s = new Student(id, name, age, address);
        list.add(s);
        System.out.println("added successfully!");


    }

    public static void deleteStudent(ArrayList<Student> list) {
        //System.out.println("deleteStudent");
        Scanner sc = new Scanner(System.in);
        System.out.println("please input id: ");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("delete successfully! id: " + id);
        } else {
            System.out.println("user doesn't exist，delete unsuccessfully!");

        }
    }

    public static void updateStudent(ArrayList<Student> list) {
        //System.out.println("updateStudent");
        Scanner sc = new Scanner(System.in);
        System.out.println("please input id: ");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index < 0) {
            System.out.println("user doesn't exist, update unsuccessfully");
        } else {
            System.out.println("please input name: ");
            String name = sc.next();
            System.out.println("please input age: ");
            int age = sc.nextInt();
            System.out.println("please input address: ");
            String address = sc.next();

            Student s = new Student(id, name, age, address);
            list.set(index, s);
            System.out.println("updated successfully, id: " + id);
        }
    }

    public static void selectStudent(ArrayList<Student> list) {
        //System.out.println("selectStudent");
        if (list.size() == 0) {
            System.out.println("no student, please add first!");
            return;
        }

        System.out.println("id\t\tname\t\tage\t\taddress");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getAddress());
        }

    }

    public static boolean contains(ArrayList<Student> list, String id) {
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
