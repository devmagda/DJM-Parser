package de.dj.djm.parser.impl.attributes.text;

import de.dj.djm.parser.impl.attributes.custom.classes.Text;
import de.dj.djm.parser.api.attributes.custom.TextAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.HW_IN_MIX_ON;

public class HwInMixOn extends TextAttribute {
    public HwInMixOn(String text) {
        this(HW_IN_MIX_ON, new Text(text));
    }
    protected HwInMixOn(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }
}
