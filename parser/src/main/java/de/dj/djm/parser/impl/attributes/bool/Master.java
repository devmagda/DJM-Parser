package de.dj.djm.parser.impl.attributes.bool;

import de.dj.djm.parser.api.attributes.custom.BoolAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;

import static de.dj.djm.parser.api.attributes.Attributes.MASTER;

public class Master extends BoolAttribute {
    public Master(boolean value) {
        this(MASTER, new Bool(value));
    }
    protected Master(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
