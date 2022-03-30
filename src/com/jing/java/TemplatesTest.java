package com.jing.java;

import com.jing.bean.Customer;

import java.util.ArrayList;

public class TemplatesTest {

    //模板六：prsf: 可生成 private static final 私有的静态的常量
    private static final Customer cust = new Customer();
    //变形 psf    public static final
    public static final int num = 1;
    //变形 psfi    public static final int
    public static final int num2 = 2;
    //变形 psfs    public static final string
    public static final String nation="china";

    //模板一：实现main方法 用psvm
    public static void main(String[] args) {

        //模板二：输出 sout
        System.out.println("hello");
        //sout的变形： soutp/   soutm/  soutv/  xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num1 =10;
        System.out.println("num1 = " + num1);
        int num2 =20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        //模板三： fori
        String[] arr = new String[]{"Tom","Jerry","Hanmeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形：iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar 普通for循环
        for (int j = 0; j < arr.length; j++) {
            String s = arr[j];
            System.out.println(s);
        }

        //模板四： list.for 增强for循环
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {

        }
        //变形： list.fori 普通for循环
        for (int i1 = 0; i1 < list.size(); i1++) {

        }
        //变形： list.forr 倒序for循环
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {

        }



    }

    public void method(){
        System.out.println("TemplatesTest.method");

        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        //模板五：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn/ xxx.null
        if (list == null) {

        }

        if (list != null) {

        }


    }

}