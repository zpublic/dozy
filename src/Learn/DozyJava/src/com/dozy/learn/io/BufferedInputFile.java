//: io/BufferedInputFile.java
package com.dozy.learn.io;

import java.io.*;

public class BufferedInputFile {
    // Throw exceptions to console:
    public static String read(String filename) throws IOException {
        // Reading input by lines:
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null)
            sb.append(s + "\n");
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.print(read("src\\com\\dozy\\learn\\io\\BufferedInputFile.java"));
    }
} /* (Execute to see output) */// :~
