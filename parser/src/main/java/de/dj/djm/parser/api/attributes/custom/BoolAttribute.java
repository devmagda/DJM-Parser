package de.dj.djm.parser.api.attributes.custom;

import de.dj.djm.parser.api.attributes.AttributeBase;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;

public abstract class BoolAttribute extends AttributeBase<Bool> {
    protected BoolAttribute(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }
}
