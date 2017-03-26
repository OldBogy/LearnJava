package com.learn.chapter2;

/**
 * Created by sy on 2017/3/26.
 */
public class Test1 {
    private int cout;
    private char test;

    public char getTest() {
        return test;
    }

    public int getCout() {
        return cout;
    }

    public void setTest(char test) {
        this.test = test;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println("count:"+test1.cout);
        System.out.println("test:"+test1.test);
    }
}
