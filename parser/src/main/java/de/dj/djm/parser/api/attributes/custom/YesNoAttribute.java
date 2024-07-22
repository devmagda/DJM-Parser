package de.dj.djm.parser.api.attributes.custom;

import de.dj.djm.parser.impl.attributes.custom.classes.Bool;
import de.dj.djm.parser.libs.StringPool;

import static de.dj.djm.parser.api.attributes.Attributes.INVERTED;
import static de.dj.djm.parser.libs.StringLibs.concatEqu;
import static de.dj.djm.parser.libs.StringLibs.enquote;

public abstract class YesNoAttribute extends BoolAttribute {
    public YesNoAttribute(boolean value) {
        this(INVERTED, new Bool(value));
    }
    protected YesNoAttribute(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }

    @Override
    public String format() {
        return concatEqu(getAttributeName(), enquote(getAttributeValue().isBool() ? StringPool.YES : StringPool.NO));
    }
}
