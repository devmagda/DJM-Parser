package de.dj.djm.parser.impl.attributes.bool;

import de.dj.djm.parser.impl.attributes.custom.classes.Bool;
import de.dj.djm.parser.api.attributes.custom.BoolAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.REC;

public class Rec extends BoolAttribute {
    public Rec(boolean value) {
        this(REC, new Bool(value));
    }
    protected Rec(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
