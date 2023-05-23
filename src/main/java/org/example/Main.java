package org.example;

import java.util.*;

public class  Main {
    static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static List<String> three = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        for(int num : nums ) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println("------");
    }

    public static void task2() {
        Collections.sort(nums);
        int delete = Integer.MIN_VALUE;
        for (int num : nums ) {
            if ((num % 2 == 0) && (num != delete)) {
                    System.out.println(num);
                    delete = num;
                }
        }
        System.out.println("------");
    }

    public static void task3() {
        Set<String> replay = new HashSet<>(three);
        System.out.println(replay);
    }

    public static void task4() {
        Set<String> replay = new HashSet<>(three);
        System.out.println(three.size() - replay.size());

    }
    }

