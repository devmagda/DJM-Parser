package de.dj.djm.parser.impl.attributes.bool;

import de.dj.djm.parser.api.attributes.custom.BoolAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;

import static de.dj.djm.parser.api.attributes.Attributes.FX;

public class Fx extends BoolAttribute {
    public Fx(boolean value) {
        this(FX, new Bool(value));
    }
    protected Fx(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
