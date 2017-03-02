package com.lzk;

/**
 * Created by lzk on 2017/2/27.
 * Person类
 */
public class Person {
    /**
     * 对属性的封装
     */
    private String name;
    private int age;
    private String hobby;

    /**
     * setter&&getter
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
