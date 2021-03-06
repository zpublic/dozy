//: generics/CovariantReturnTypes.java
package com.dozy.learn.generics;

class Base {
}

class Derived extends Base {
}

interface OrdinaryGetter {
    Base get();
}

interface DerivedGetter extends OrdinaryGetter {
    // Return type of overridden method is allowed to vary:
    Derived get();
}

public class CovariantReturnTypes {
    @SuppressWarnings("unused")
    void test(DerivedGetter d) {
        Derived d2 = d.get();
    }
} // /:~
