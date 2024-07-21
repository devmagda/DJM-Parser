package de.dj.djm.parser.api.attributes.custom;

import de.dj.djm.parser.api.attributes.AttributeBase;
import de.dj.djm.parser.impl.attributes.custom.classes.Text;

import static de.dj.djm.parser.libs.StringLibs.concatEqu;
import static de.dj.djm.parser.libs.StringLibs.enquote;

public abstract class TextAttribute extends AttributeBase<Text> {
    protected TextAttribute(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }

    @Override
    public String format() {
        return concatEqu(getAttributeName(), enquote(getAttributeValue().format()));
    }
}
