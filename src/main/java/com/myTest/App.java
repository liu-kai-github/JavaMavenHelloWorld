package com.myTest;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        if (args.length > 0 ){
            HandleString.handle(args[0]);
            CopyFile.copyFile("Hello.txt", args[0] + ".txt");
        } else {
            HandleString.handle("World!");
            CopyFile.copyFile("Hello.txt", "World.txt");
        }




    }

}
