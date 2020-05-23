package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yanNing
 * @Date 2020/5/11 21:43
 *
 * 1.IDEA中,代码模板所处的位置：setting - Editor - Live Templates / postfix Completions
 * 2.常用的模板
 */
public class TemplateTest {
    //模板1. main - psvm
    public static void main(String[] args) {
        //模板2. syso - sout
        System.out.println("templates");
        //拓展-sout： soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");    //打印形参-soutp
        System.out.println("TemplateTest.main");        //打印所在的方法名-soutm
        int num = 1;
        System.out.println("num = " + num);             //打印变量名称-soutv[打印时遵循就近原则]

        //模板3. fori
        String[] arr = {"Tom","Jerry","LiLei","HanMeiMei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //拓展-fori: iter
        for (String s : arr) {
            System.out.println(s);
        }
        //拓展-fori: itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }
        //模板4. list.for
        List<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        for (Object o : arrayList) {
            System.out.println("o = " + o);
        }
        //拓展-list：fori
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("i = " + arrayList.get(i));
        }

    }
}
