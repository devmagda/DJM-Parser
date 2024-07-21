package de.dj.djm.parser.impl.attributes.custom.color;

import de.dj.djm.parser.impl.attributes.custom.classes.Color;
import de.dj.djm.parser.api.attributes.custom.ColorAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.MAX;

public class Max extends ColorAttribute {
    public Max(Color color) {
        this(MAX, color);
    }
    protected Max(String attributeName, Color attributeValue) {
        super(attributeName, attributeValue);
    }
}
