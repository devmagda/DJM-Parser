package de.dj.djm.parser.api.attributes.custom;

import de.dj.djm.parser.api.attributes.AttributeBase;
import de.dj.djm.parser.impl.attributes.custom.classes.Color;

public abstract class ColorAttribute extends AttributeBase<Color> {
    public ColorAttribute(String attributeName, Color attributeValue) {
        super(attributeName, attributeValue);
    }

    public String getHexColor() {
        return getAttributeValue().getHex();
    }

    @Override
    public String format() {
        return null;
    }
}
