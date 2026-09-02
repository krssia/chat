package org.example;

import java.lang.reflect.Field;
import java.util.ArrayList;


public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList);
        arrayList.set(0, 2);
        arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);
        arrayList.add(2, 0);
        System.out.println(arrayList);

        ArrayList<String> arrayList1 = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            arrayList1.add(String.valueOf(i));
            System.out.println(arrayList1.get(i));
        }
        // 触发ConcurrentModificationException
//        for(String s : arrayList1) {
//            arrayList1.remove(s);
//        }
        System.out.println(arrayList1);
    }
}
