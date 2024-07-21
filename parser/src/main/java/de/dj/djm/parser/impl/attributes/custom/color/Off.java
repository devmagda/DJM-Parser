package de.dj.djm.parser.impl.attributes.custom.color;

import de.dj.djm.parser.impl.attributes.custom.classes.Color;
import de.dj.djm.parser.api.attributes.custom.ColorAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.OFF;

public class Off extends ColorAttribute {
    public Off(Color color) {
        this(OFF, color);
    }
    protected Off(String attributeName, Color attributeValue) {
        super(attributeName, attributeValue);
    }
}
