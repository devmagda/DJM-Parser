package de.dj.djm.parser.impl.attributes.text;

import de.dj.djm.parser.api.attributes.custom.TextAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Text;

import static de.dj.djm.parser.api.attributes.Attributes.SYSEX;

public class Sysex extends TextAttribute {
    public Sysex(String text) {
        this(SYSEX, new Text(text));
    }
    protected Sysex(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }
}
