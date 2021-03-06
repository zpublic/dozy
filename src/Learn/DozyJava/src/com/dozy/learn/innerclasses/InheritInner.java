//: innerclasses/InheritInner.java
package com.dozy.learn.innerclasses;

// Inheriting an inner class.

class WithInner {
    class Inner {
    }
}

public class InheritInner extends WithInner.Inner {
    // ! InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        @SuppressWarnings("unused")
        InheritInner ii = new InheritInner(wi);
    }
} // /:~
