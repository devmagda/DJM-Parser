package de.dj.djm.utils.impl.generators;

public class IdGenerator {
    private static int count = 0;

    public static int getInt() {
        return count++;
    }
}
