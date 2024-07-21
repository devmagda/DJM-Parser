package de.dj.djm.parser.impl.attributes.number;

import de.dj.djm.parser.api.attributes.custom.NumberAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Number;

import static de.dj.djm.parser.api.attributes.Attributes.CHANNELS;

public class Channels extends NumberAttribute {
    public Channels(int number) {
        this(CHANNELS, new Number(number));
    }
    protected Channels(String attributeName, Number attributeValue) {
        super(attributeName, attributeValue);
    }
}
