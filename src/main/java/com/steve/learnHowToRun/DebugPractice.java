package com.steve.learnHowToRun;

public class DebugPractice {

    public static void main(String[] args) {
        System.out.println("參數1:" + args[0]);
        System.out.println("java版本:" + System.getProperty("java.version"));
        System.out.println("java位置:" + System.getProperty("java.home"));
        System.out.println("steve name:" + System.getProperty("steve.name"));
        System.out.println("steve name:" + System.getenv("STEVE_SECOND_NAME"));
        System.out.println(System.getenv("JAVA_HOME"));

    }

}