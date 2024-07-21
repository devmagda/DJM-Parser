package de.dj.djm.parser.impl.attributes.text;

import de.dj.djm.parser.impl.attributes.custom.classes.Text;
import de.dj.djm.parser.api.attributes.custom.TextAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.DESCRIPTION;

public class Description extends TextAttribute {
    public Description(String text) {
        this(DESCRIPTION, new Text(text));
    }
    protected Description(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }
}
