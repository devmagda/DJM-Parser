package de.dj.djm.parser.api.attributes.custom;

import de.dj.djm.parser.impl.attributes.custom.classes.Number;
import de.dj.djm.parser.api.attributes.AttributeBase;

import static de.dj.djm.parser.libs.StringLibs.concatEqu;
import static de.dj.djm.parser.libs.StringLibs.enquote;

public abstract class NumberAttribute extends AttributeBase<Number> {
    protected NumberAttribute(String attributeName, Number attributeValue) {
        super(attributeName, attributeValue);
    }

    @Override
    public String format() {
        return concatEqu(getAttributeName(), enquote(getAttributeValue().getHex()));
    }
}
