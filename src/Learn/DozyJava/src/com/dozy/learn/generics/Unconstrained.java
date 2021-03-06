//: generics/Unconstrained.java
package com.dozy.learn.generics;

class Other {
}

class BasicOther extends BasicHolder<Other> {
}

public class Unconstrained {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        BasicOther b = new BasicOther(), b2 = new BasicOther();
        b.set(new Other());
        Other other = b.get();
        b.f();
    }
} /*
   * Output: Other
   */// :~
