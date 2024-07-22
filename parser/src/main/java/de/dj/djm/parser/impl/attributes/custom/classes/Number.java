package de.dj.djm.parser.impl.attributes.custom.classes;

import de.dj.djm.parser.api.Formattable;

import java.util.HexFormat;

import static de.dj.djm.parser.libs.CharPool.DASH;
import static de.dj.djm.parser.libs.CharPool.SLASH;

public class Number implements Formattable {
    private final int _number;
    public Number(int number) {
        if(number < -1) throw new IllegalArgumentException("Number must be positive. Was: " + number + "!");
        this._number = number;
    }

    public Number(String hex) {
        this(fromHex(hex)._number);
    }

    public static Number fromHex(String s) {
        try {
            int i = HexFormat.fromHexDigits(s);
            return new Number(i);
        } catch(Exception e) {
            if(s.contains(""+ DASH)) {
                return new Number(0) {
                    @Override
                    public String format() {
                        return s;
                    }
                };
            } else {
                throw new RuntimeException("The following hex value could not be parsed: " + s, e);
            }
        }
    }

    public String getHex() {
        return HexFormat.of().toHexDigits(_number).substring(6);
    }

    @Override
    public String format() {
        return getHex();
    }

    public int getInt() {
        return _number;
    }
}
