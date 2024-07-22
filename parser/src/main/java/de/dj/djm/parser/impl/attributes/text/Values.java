package de.dj.djm.parser.impl.attributes.text;

import de.dj.djm.parser.api.attributes.custom.TextAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Text;

import static de.dj.djm.parser.api.attributes.Attributes.MODE;
import static de.dj.djm.parser.api.attributes.Attributes.VALUES;

public class Values extends TextAttribute {
    public Values(String text) {
        this(VALUES, new Text(text));
    }
    protected Values(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }
}
