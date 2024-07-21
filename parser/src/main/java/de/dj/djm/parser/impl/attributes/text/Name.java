package de.dj.djm.parser.impl.attributes.text;

import de.dj.djm.parser.impl.attributes.custom.classes.Text;
import de.dj.djm.parser.api.attributes.custom.TextAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.NAME;

public class Name extends TextAttribute {
    public Name(String text) {
        this(NAME, new Text(text));
    }
    protected Name(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }
}
