package de.dj.djm.parser.impl.attributes.bool;

import de.dj.djm.parser.api.attributes.custom.BoolAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;

import static de.dj.djm.parser.api.attributes.Attributes.GAIN;

public class Gain extends BoolAttribute {
    public Gain(boolean value) {
        this(GAIN, new Bool(value));
    }
    protected Gain(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
