package de.dj.djm.parser.impl.attributes.text;

import de.dj.djm.parser.api.attributes.custom.TextAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Text;

import static de.dj.djm.parser.api.attributes.Attributes.TYPE;

public class Type extends TextAttribute {
    public Type(String text) {
        this(TYPE, new Text(text));
    }
    protected Type(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }
}
