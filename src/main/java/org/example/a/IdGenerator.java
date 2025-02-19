package org.example.a;

public class IdGenerator {
    private static final int max = 1000000;
    private static final int min = 0;

    public static Long generateId() {
        Long id = (long) (Math.random() * max + 1) + min;
        return id;
    }
}
