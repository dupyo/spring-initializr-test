package com.sparta.week01.prac;

import java.util.List;


public class Prac {
    public Prac() {
    }


    public static void printInfo() {
        String title = "웹개발의 봄 Spring";
        String tutor = "남병관";
        int weeks = 5;
        float ratings = 5.0f;

        System.out.println("제목: " + title);
        System.out.println("튜터: " + tutor);
        System.out.println("주차: " + weeks);
        System.out.println("별점: " + ratings);
    }

    // 파라미터 X, 반환값 X
    public static void simplePrint() {
        System.out.println("파라미터도 없고, 반환값도 없어요!");
    }

    // 파라미터 O, 반환값 X
    public static void simpleSum(int num1, int num2) {
        System.out.println("num1 :" + num1 + ", num2: " + num2);
    }

    // 파라미터 X, 반환값 O
    public static int simpleReturn() {
        return 3;
    }

    // 파라미터 O, 반환값 O
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // 두 정수를 받아서, 뺀 값을 반환하는 메소드
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    // 과일 목록을 받아서, 과일 개수를 반환하는 메소드
    public static int countFruit(List<String> fruits, String fruit) {
        int count = 0;
        for (String s : fruits) {
            if (fruit.equals(s)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {    // import 단축키 Alt + Enter
        Course course = new Course();
        course.setTitle("웹개발 종합반 Spring");
        course.setTutor("홍두표");
        course.setDays(35);

        Tutor tutor = new Tutor("홍두표", "신입개발자");
        System.out.println(tutor.toString());
    }

}
