package de.dj.djm.parser.impl.attributes.bool;

import de.dj.djm.parser.api.attributes.custom.BoolAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;

import static de.dj.djm.parser.api.attributes.Attributes.CUE_2_MIX;

public class Cue2Mix extends BoolAttribute {
    public Cue2Mix(boolean value) {
        this(CUE_2_MIX, new Bool(value));
    }
    protected Cue2Mix(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
