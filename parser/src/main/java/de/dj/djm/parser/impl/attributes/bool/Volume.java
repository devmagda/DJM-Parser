package de.dj.djm.parser.impl.attributes.bool;

import de.dj.djm.parser.api.attributes.custom.BoolAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;

import static de.dj.djm.parser.api.attributes.Attributes.VOLUME;

public class Volume extends BoolAttribute {
    public Volume(boolean value) {
        this(VOLUME, new Bool(value));
    }
    protected Volume(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
