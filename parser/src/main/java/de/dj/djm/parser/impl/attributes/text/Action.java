package de.dj.djm.parser.impl.attributes.text;

import de.dj.djm.parser.impl.attributes.custom.classes.Text;
import de.dj.djm.parser.api.attributes.custom.TextAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.ACTION;

public class Action extends TextAttribute {
    public Action(String text) {
        this(ACTION, new Text(text));
    }

    protected Action(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }
}
