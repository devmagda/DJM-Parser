package de.dj.djm.parser.impl.attributes.number;

import de.dj.djm.parser.api.attributes.custom.NumberAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Number;

import static de.dj.djm.parser.api.attributes.Attributes.ID;

public class Id extends NumberAttribute {
    public Id(int number) {
        this(ID, new Number(number));
    }
    protected Id(String attributeName, Number attributeValue) {
        super(attributeName, attributeValue);
    }
}
