package com.itheima.a08regexdemo;

public class RegexDemo4 {
    public static void main(String[] args) {
        //13112345678 13712345667 13945679027 139456790271
        String regex = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex));
        System.out.println("13712345667".matches(regex));
        System.out.println("13945679027".matches(regex));
        System.out.println("139456790271".matches(regex));
        System.out.println("------------------");

        //020-2324242 02122442 027-42424 0712-3242434
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("02122442".matches(regex2));
        System.out.println("027-42424".matches(regex2));
        System.out.println("0712-3242434".matches(regex2));
        System.out.println("------------------");

        //3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(regex3));
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
        System.out.println("dlei0009@163.com".matches(regex3));
        System.out.println("dlei0009@pci.com.cn".matches(regex3));

        String regex4 = "([01]\\d|2[0-3])(:[0-5]\\d){1,2}";

        System.out.println("23:59:59".matches(regex4));




    }
}
