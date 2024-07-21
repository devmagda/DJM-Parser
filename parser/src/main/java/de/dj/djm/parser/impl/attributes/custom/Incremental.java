package de.dj.djm.parser.impl.attributes.custom;

import de.dj.djm.parser.libs.StringPool;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;
import de.dj.djm.parser.api.attributes.custom.BoolAttribute;

import static de.dj.djm.parser.libs.StringLibs.concatEqu;
import static de.dj.djm.parser.libs.StringLibs.enquote;
import static de.dj.djm.parser.api.attributes.Attributes.INCREMENTAL;

public class Incremental extends BoolAttribute {
    public Incremental(boolean value) {
        this(INCREMENTAL, new Bool(value));
    }
    protected Incremental(String attributeName, Bool attributeValue) {
        super(attributeName, attributeValue);
    }

    @Override
    public String format() {
        return concatEqu(getAttributeName(), enquote(getAttributeValue().isBool() ? StringPool.YES : StringPool.NO));
    }
}
