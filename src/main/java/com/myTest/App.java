package com.myTest;

import static strman.Strman.append;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        String s = append("f", "o", "o", "b", "a", "r");
        HandleString handle = new HandleString();
        System.out.println(handle.handle());
        System.out.println("Hello World!");
    }
}
