package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class practice {
    public static void main(String[] args){
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(20);
        s.add(30);
        s.add(30);

        System.out.println("HashSet:"+s);

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(10);
        s2.add(20);
        s2.add(20);
        s2.add(30);
        s2.add(30);
        s2.add(40);
        s2.add(40);
        s2.add(50);
        s2.add(null);
        s2.add(null);
        s2.add(1);


        System.out.println("LinkedHashSet:"+s2);

        Set<Integer> s3 = new TreeSet<>();
        s3.add(10);
        s3.add(30);
        s3.add(30);
        s3.add(20);
        s3.add(40);
        s3.add(1);
        s3.add(2);

        System.out.println("TreeSet:"+s3);
    }
}


