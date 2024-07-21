package de.dj.djm.parser.impl.attributes.custom.classes;

import de.dj.djm.parser.api.Formattable;

import static de.dj.djm.parser.libs.StringLibs.enquote;

public class Undefined implements Formattable {
    @Override
    public String format() {
        return enquote("");
    }

    public static Undefined get() {
        return new Undefined();
    }
}
