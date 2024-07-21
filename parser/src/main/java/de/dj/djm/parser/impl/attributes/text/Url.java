package de.dj.djm.parser.impl.attributes.text;

import de.dj.djm.parser.api.attributes.custom.TextAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Text;

import static de.dj.djm.parser.api.attributes.Attributes.URL;

public class Url extends TextAttribute {
    public Url(String text) {
        this(URL, new Text(text));
    }
    protected Url(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }
}
