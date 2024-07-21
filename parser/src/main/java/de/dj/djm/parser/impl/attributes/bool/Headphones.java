package de.dj.djm.parser.impl.attributes.bool;

import de.dj.djm.parser.api.attributes.custom.BoolAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;

import static de.dj.djm.parser.api.attributes.Attributes.HEADPHONES;

public class Headphones extends BoolAttribute {

    public Headphones(boolean value) {
        this(HEADPHONES, new Bool(value));
    }
    protected Headphones(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
