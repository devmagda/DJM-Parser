package de.dj.djm.parser.impl.attributes.custom.color;

import de.dj.djm.parser.impl.attributes.custom.classes.Color;
import de.dj.djm.parser.api.attributes.custom.ColorAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.ON;

public class On extends ColorAttribute {
    public On(Color color) {
        this(ON, color);
    }
    protected On(String attributeName, Color attributeValue) {
        super(attributeName, attributeValue);
    }
}
