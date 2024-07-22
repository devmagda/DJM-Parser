package de.dj.djm.parser.impl.attributes.custom;

import de.dj.djm.parser.api.attributes.custom.YesNoAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;

import static de.dj.djm.parser.api.attributes.Attributes.INVERTED;
import static de.dj.djm.parser.api.attributes.Attributes.VELOCITY;

public class Velocity extends YesNoAttribute {
    public Velocity(boolean value) {
        this(VELOCITY, new Bool(value));
    }
    protected Velocity(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
