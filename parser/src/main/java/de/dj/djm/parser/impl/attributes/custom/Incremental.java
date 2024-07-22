package de.dj.djm.parser.impl.attributes.custom;

import de.dj.djm.parser.api.attributes.custom.YesNoAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;

import static de.dj.djm.parser.api.attributes.Attributes.INCREMENTAL;

public class Incremental extends YesNoAttribute {
    public Incremental(boolean value) {
        this(INCREMENTAL, new Bool(value));
    }
    protected Incremental(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
