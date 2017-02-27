package com.lzk;

/**
 * Created by lzk on 2017/2/27.
 * Person类
 */
public class Person {
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        int x = 103;
        System.out.println("x的值为" + x);
        /**
         * 一个数字会被编译器默认为int型，我们可以在数字后添加大写的L来告诉编译器此数字是long型
         */
        long y = 17896529786562L;//long型后面要加L

        byte a = 127;

        a = (byte)(a + 1);

        System.out.println("" + a);

        // 10.5这种带小数的数字,编译器会默认为是double类型
        float z = 10.5f;
        double c = 10.5;
        char d = 'a';
        boolean e = true;

        if (x > 10)
        {
            System.out.println(x);
        } else {
            System.out.println("不大于10");
        }
    }
}
