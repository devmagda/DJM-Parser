package de.dj.djm.parser.impl.attributes.bool;

import de.dj.djm.parser.impl.attributes.custom.classes.Bool;
import de.dj.djm.parser.api.attributes.custom.BoolAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.MIXER;

public class Mixer extends BoolAttribute {
    public Mixer(boolean value) {
        this(MIXER, new Bool(value));
    }
    protected Mixer(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
