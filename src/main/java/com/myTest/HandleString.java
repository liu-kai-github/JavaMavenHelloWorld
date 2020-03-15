package com.myTest;

import static strman.Strman.append;

public class HandleString {

    static void handle(String name){
        String s = append("Hello ", name);
        System.out.println(s);
    }

}
