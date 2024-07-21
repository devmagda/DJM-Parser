package de.dj.djm.parser.libs;

public class StringLibs {
    public static String enquote(String s) {
        return "\"" + s + "\"";
    }

    public static String concatEqu(String a, String b) {
        return a + "=" + b;
    }
}
