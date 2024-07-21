package de.dj.djm.parser.impl.attributes.text;

import de.dj.djm.parser.impl.attributes.custom.classes.Text;
import de.dj.djm.parser.api.attributes.custom.TextAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.MODE;

public class Mode extends TextAttribute {
    public Mode(String text) {
        this(MODE, new Text(text));
    }
    protected Mode(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }
}
