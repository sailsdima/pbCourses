package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        MyTreeSet set = new MyTreeSet();
        set.add("6");
        set.add("5");
        set.add("1");
        set.add("7");
        set.add("8");
        set.add("2");
        System.out.println(set.contains("a"));
        System.out.println(set.contains("b"));
        System.out.println(set.contains("z"));
        System.out.println(set.getSize());
        set.iterator();
        Set sset = new TreeSet();
        sset.add(3);
        sset.remove(212);
        java.util.Iterator iterator = sset.iterator();
    }
}
