package de.dj.djm.parser.impl.attributes.number;

import de.dj.djm.parser.api.attributes.custom.NumberAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Number;

import static de.dj.djm.parser.api.attributes.Attributes.CHANNELS;
import static de.dj.djm.parser.api.attributes.Attributes.SEND_RATIO;

public class SendRatio extends NumberAttribute {
    public SendRatio(int number) {
        this(SEND_RATIO, new Number(number));
    }
    protected SendRatio(String attributeName, Number attributeValue) {
        super(attributeName, attributeValue);
    }
}
