package de.dj.djm.parser.impl.attributes.custom;

import de.dj.djm.parser.api.attributes.custom.YesNoAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;

import static de.dj.djm.parser.api.attributes.Attributes.INVERTED;

public class Inverted extends YesNoAttribute {
    public Inverted(boolean value) {
        this(INVERTED, new Bool(value));
    }
    protected Inverted(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
