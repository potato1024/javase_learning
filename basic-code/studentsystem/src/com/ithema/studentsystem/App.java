package com.ithema.studentsystem;

import java.net.SocketTimeoutException;
import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    private static final String LOG_IN = "1";
    private static final String SIGN_UP = "2";
    private static final String RESET = "3";
    private static final String EXIT = "4";

    static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("admin", "admin", "511024199901011234", "12345678901"));
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----------the best student system plus-----------------");
            System.out.println("please choose: 1 log in; 2 sign up; 3 forget password; 4 exit");
            System.out.println("please input your choose: ");
            String choose = sc.next();
            switch (choose) {
                case LOG_IN -> login(list);
                case SIGN_UP -> signup(list);
                case RESET -> reset(list);
                case EXIT -> {
                    System.out.println("exit");
                    System.exit(0);
                }


                default -> System.out.println("wrong choose");
            }
        }
    }

    public static void login(ArrayList<User> list) {
        printList(list);
        Scanner sc = new Scanner(System.in);
        System.out.println("please input username: ");
        String username = sc.next();
        int index = getIndex(list, username);
        if (index < 0) {
            System.out.println("user doesn't register, please sign up first!");
            return;
        }

        while (true) {
            String val = getCode();
            System.out.println("please input val-code: " + val);
            String valInput = sc.next();
            if (!val.equals(valInput)) {
                System.out.println("val-code is not correct!");
            } else break;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("please input password: ");
            String password = sc.next();
            if (list.get(index).getPassword().equals(password)) {

                System.out.println("login successfully!");
                StudentSystem ss = new StudentSystem();
                ss.start();
                return;
            } else {
                System.out.println("password is not correct! you have " + (2 - i) + " opportunities");
            }
        }
        System.out.println("login unsuccessfully!");
    }

    public static void signup(ArrayList<User> list) {
        printList(list);
        Scanner sc = new Scanner(System.in);
        System.out.println("please input username: ");
        String username;
        while (true) {
            username = sc.next();
            if (checkUsername(username)) {
                if (!contains(list, username)) {
                    break;
                }
                System.out.println("username already exists! please re-enter: ");
            }
        }


        String password;
        while (true) {
            System.out.println("please input password: ");
            password = sc.next();
            System.out.println("please input password again: ");
            String password2 = sc.next();
            if (password2.equals(password)) {
                break;
            }
            System.out.println("the two inputs are inconsistent!");
        }

        System.out.println("please input card-ID: ");
        String cardId;
        while (true) {
            cardId = sc.next();
            if (checkCardId(cardId)) {
                break;
            }
        }


        System.out.println("please input phoneNo: ");
        String phoneNo;
        while (true) {
            phoneNo = sc.next();
            if (checkPhoneNo(phoneNo)) {
                break;
            }

        }

        User user = new User(username, password, cardId, phoneNo);

        list.add(user);

        printList(list);
    }

    public static void reset(ArrayList<User> list) {
        //System.out.println("reset");
        printList(list);
        Scanner sc = new Scanner(System.in);
        System.out.println("please input username: ");
        String username = sc.next();
        int index = getIndex(list, username);
        if (index < 0) {
            System.out.println("user doesn't register, please sign up first!");
            return;
        }
        System.out.println("please input cardId: ");
        String cardId = sc.next();
        System.out.println("please input phoneNo: ");
        String phoneNo = sc.next();
        User user = list.get(index);
        if (user.getCardId().equals(cardId) && user.getPhoneNo().equals(phoneNo)) {
            String password;
            while (true) {
                System.out.println("please input new password: ");
                password = sc.next();
                System.out.println("please input new password again: ");
                String password2 = sc.next();
                if (password2.equals(password)) {
                    break;
                }
                System.out.println("the two inputs are inconsistent!");
            }
            user.setPassword(password);
            list.set(index, user);
            System.out.println("update the password successfully!");
            return;
        }
        System.out.println("your info is correct, update unsuccessfully!");


    }

    public static int getIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(ArrayList<User> list, String username) {
        return getIndex(list, username) >= 0;
    }

    public static boolean checkUsername(String username) {
        if (username.length() < 3 || username.length() > 15) {
            System.out.println("length is illegal, please re-enter: ");
            return false;
        }
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (c > '0' && c < '9') {
                count++;
            }
            if ((c < '0') || (c > '9' && c < 'A') || (c > 'Z' && c < 'a') || (c > 'z')) {
                System.out.println("char is illegal, please re-enter: ");
                return false;
            }

        }
        if (count == username.length()) {
            System.out.println("username is all digits, please re-enter: ");
            return false;
        }
        return true;


    }


    public static boolean checkCardId(String cardId) {
        if (cardId.length() != 18) {
            System.out.println("length is illegal, please re-enter: ");
            return false;
        }
        if (cardId.startsWith("0")) {
            System.out.println("the first character cannot be 0, please re-enter: ");
            return false;
        }
        for (int i = 0; i < 17; i++) {
            char c = cardId.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("char is illegal, please re-enter: ");
                return false;

            }

        }
        char c = cardId.charAt(17);
        if ((c > '0' && c < '9') || c == 'x' || c == 'X') {
            return true;
        }
        System.out.println("char is illegal, please re-enter: ");
        return false;


    }

    public static boolean checkPhoneNo(String phoneNo) {
        if (phoneNo.length() != 11) {
            System.out.println("length is illegal, please re-enter: ");
            return false;
        }
        if (phoneNo.startsWith("0")) {
            System.out.println("the first character cannot be 0, please re-enter: ");
            return false;
        }
        for (int i = 0; i < 11; i++) {
            char c = phoneNo.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("char is illegal, please re-enter: ");
                return false;

            }

        }
        return true;


    }

    public static void printList(ArrayList<User> list) {
        System.out.println("username\t\tpassword\t\tcardId\t\tphoneNo\t\t");
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername() + "\t\t" + user.getPassword() + "\t\t" + user.getCardId() + "\t\t" + user.getPhoneNo());

        }
    }

    public static String getCode() {
        ArrayList<Character> chlist = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            chlist.add((char) ('a' + i));
            chlist.add((char) ('A' + i));

        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        int index = r.nextInt(5);
        for (int i = 0; i < 5; i++) {
            if (index == i) {
                sb.append(r.nextInt(10));
            } else {
                sb.append(chlist.get(r.nextInt(chlist.size())));
            }

        }
        return sb.toString();
    }

}
