package com.pack.java;

import com.pack.bean.Customer;

import java.util.ArrayList;

/**
 * @author gynnd
 * @date 2021/9/4 - 17:20
 *
 * IDEA中代码模板所处的位置：settings-Editor-live Templates/Postfix Completion
 * 2.常用的模板
 */


public class TemplatesTest {

    //模板6 prsf
    private static final Customer cust = new Customer();

    //变形：psf
    public static final int Num = 1;
    //变形：psfi
    public static final int numm = 2;
    //变形：psfs
    public static final String str = "gynnd";

    




    //模板1 main psvm
    public static void main(String[] args) {
        //模板2 sout
         System.out.println("hello");
        //变形：soutp/ soutm/ soutv/ xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);
        int num1 = 10;
        System.out.println("num1 = " + num1);//soutv
        System.out.println(num1);//num1.sout

        //模板3 fori
        String[] arr = new String[]{"Tom","Jerry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }

        //模板4  list.for
        ArrayList list  = new ArrayList();
        list.add(123);
        list.add(456);

        for (Object o : list) {
            
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        //模板5 ifn






    }
    public void method() {

        //模板5 ifn list.null
        ArrayList list  = new ArrayList();
        list.add(123);
        list.add(456);
        if (list == null) {

        }
        //变形 inn list.nn
        if (list != null) {

        }



    }

}

