//: object/ShowProperties.java
package com.dozy.learn.object;

public class ShowProperties {
    public static void dozy_main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
} // /:~