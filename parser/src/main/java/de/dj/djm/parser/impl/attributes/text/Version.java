package de.dj.djm.parser.impl.attributes.text;

import de.dj.djm.parser.api.attributes.custom.TextAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Text;

import static de.dj.djm.parser.api.attributes.Attributes.VERSION;

public class Version extends TextAttribute {
    public Version(String text) {
        this(VERSION, new Text(text));
    }
    protected Version(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }
}
