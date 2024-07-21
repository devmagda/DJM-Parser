package de.dj.djm.parser.impl.attributes.custom.classes;

import de.dj.djm.parser.api.Formattable;

import java.util.HexFormat;

public class Number implements Formattable {
    private final int _number;
    public Number(int number) {
        if(number < 0) throw new IllegalArgumentException("Number must be positive. Was: " + number + "!");
        if(number > 255) throw new IllegalArgumentException("Number must be lower than 255. Was: " + number + "!");
        this._number = number;
    }

    public Number(String hex) {
        this(fromHex(hex)._number);
    }

    public static Number fromHex(String s) {
        return new Number(HexFormat.fromHexDigits(s));
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
