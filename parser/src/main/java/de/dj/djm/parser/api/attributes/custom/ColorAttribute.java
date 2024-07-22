package de.dj.djm.parser.api.attributes.custom;

import de.dj.djm.parser.api.attributes.AttributeBase;
import de.dj.djm.parser.impl.attributes.custom.classes.Color;

import static de.dj.djm.parser.libs.StringLibs.concatEqu;
import static de.dj.djm.parser.libs.StringLibs.enquote;

public abstract class ColorAttribute extends AttributeBase<Color> {
    public ColorAttribute(String attributeName, Color attributeValue) {
        super(attributeName, attributeValue);
    }

    public String getHexColor() {
        return getAttributeValue().getHex();
    }
}
