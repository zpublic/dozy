//: access/Cake.java
package com.dozy.learn.access;

// Accesses a class in a separate compilation unit.

class Cake {
    public static void main(String[] args) {
        Pie x = new Pie();
        x.f();
    }
} /*
   * Output: Pie.f()
   */// :~
