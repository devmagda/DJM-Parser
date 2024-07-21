package de.dj.djm.parser.impl.attributes.text;

import de.dj.djm.parser.impl.attributes.custom.classes.Text;
import de.dj.djm.parser.api.attributes.custom.TextAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.MAP_NAME;

public class MapName extends TextAttribute {
    public MapName(String text) {
        this(MAP_NAME, new Text(text));
    }
    protected MapName(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }
}
