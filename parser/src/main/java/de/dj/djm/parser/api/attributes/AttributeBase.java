package de.dj.djm.parser.api.attributes;

import de.dj.djm.parser.api.Formattable;

import static de.dj.djm.parser.libs.StringLibs.concatEqu;
import static de.dj.djm.parser.libs.StringLibs.enquote;

public abstract class AttributeBase<T extends Formattable> implements Attribute<Formattable>, Formattable {
    private final String attributeName;
    private T _attributeValue;

    public AttributeBase(String attributeName, T attributeValue) {
        this.attributeName = attributeName;
        this._attributeValue = attributeValue;
    }

    public AttributeBase(String attributeName) {
        this(attributeName, null);
    }

    public String getAttributeName() {
        return attributeName;
    }

    public T getAttributeValue() {
        return _attributeValue;
    }

    public void setAttributeValue(T attributeValue) {
        _attributeValue = attributeValue;
    }

    @Override
    public String format() {
        return concatEqu(getAttributeName(), enquote(getAttributeValue().format()));
    }

    @Override
    public String toString() {
        return format();
    }
}
