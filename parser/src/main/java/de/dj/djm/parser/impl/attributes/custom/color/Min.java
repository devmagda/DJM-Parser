package de.dj.djm.parser.impl.attributes.custom.color;

import de.dj.djm.parser.impl.attributes.custom.classes.Color;
import de.dj.djm.parser.api.attributes.custom.ColorAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.MIN;

public class Min extends ColorAttribute {
    public Min(Color color) {
        this(MIN, color);
    }
    protected Min(String attributeName, Color attributeValue) {
        super(attributeName, attributeValue);
    }
}
