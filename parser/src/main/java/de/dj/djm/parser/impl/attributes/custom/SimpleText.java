package de.dj.djm.parser.impl.attributes.custom;

import de.dj.djm.parser.api.attributes.custom.BoolAttribute;
import de.dj.djm.parser.api.attributes.custom.TextAttribute;
import de.dj.djm.parser.impl.attributes.custom.classes.Bool;
import de.dj.djm.parser.impl.attributes.custom.classes.Text;
import de.dj.djm.parser.libs.StringPool;

import static de.dj.djm.parser.api.attributes.Attributes.INCREMENTAL;
import static de.dj.djm.parser.libs.StringLibs.concatEqu;
import static de.dj.djm.parser.libs.StringLibs.enquote;

public class SimpleText extends TextAttribute {
    public SimpleText(String value) {
        this(INCREMENTAL, new Text(value));
    }
    protected SimpleText(String attributeName, Text attributeValue) {
        super(attributeName, attributeValue);
    }

    @Override
    public String format() {
        return getAttributeValue().format();
    }
}
