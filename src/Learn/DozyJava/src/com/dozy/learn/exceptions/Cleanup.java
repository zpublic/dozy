//: exceptions/Cleanup.java
package com.dozy.learn.exceptions;

// Guaranteeing proper cleanup of a resource.

public class Cleanup {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("src\\com\\dozy\\learn\\exceptions\\Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    ; // Perform line-by-line processing here...
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
} /*
   * Output: dispose() successful
   */// :~
