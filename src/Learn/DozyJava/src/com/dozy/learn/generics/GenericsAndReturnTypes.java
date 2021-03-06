//: generics/GenericsAndReturnTypes.java
package com.dozy.learn.generics;

interface GenericGetter<T extends GenericGetter<T>> {
    T get();
}

interface Getter extends GenericGetter<Getter> {
}

public class GenericsAndReturnTypes {
    @SuppressWarnings({ "unused", "rawtypes" })
    void test(Getter g) {
        Getter result = g.get();
        GenericGetter gg = g.get(); // Also the base type
    }
} // /:~
