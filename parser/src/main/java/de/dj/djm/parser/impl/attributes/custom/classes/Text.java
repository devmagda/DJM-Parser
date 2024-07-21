package de.dj.djm.parser.impl.attributes.custom.classes;

import de.dj.djm.parser.api.Formattable;

import java.util.HexFormat;

public class Text implements Formattable {
    private final String _text;
    public Text(String text) {
        this._text = text;
    }
    @Override
    public String format() {
        return _text;
    }
}
