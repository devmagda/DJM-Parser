package de.dj.djm.parser.impl.attributes.text;

import de.dj.djm.parser.impl.attributes.custom.classes.Text;
import de.dj.djm.parser.api.attributes.custom.TextAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.HW_IN_MIX_OFF;

public class HwInMixOff extends TextAttribute {
    public HwInMixOff(String text) {
        this(HW_IN_MIX_OFF, new Text(text));
    }
    protected HwInMixOff(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }
}
