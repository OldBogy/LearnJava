package com.learn.forforeach;

import java.util.ArrayList;

/**
 * Created by sy on 2017/3/25.
 */
public class ForForEach {
    public static void main(String[] args) {
        //for
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("AB");
        list.add("AC");
        list.add("bc");
        //for
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //foreach
        for (String item: list) {
            System.out.println(item);
        }


    }
}
