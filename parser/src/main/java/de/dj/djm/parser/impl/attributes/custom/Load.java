package de.dj.djm.parser.impl.attributes.custom;

import de.dj.djm.parser.api.attributes.AttributeBase;
import de.dj.djm.parser.impl.attributes.custom.classes.Undefined;

import static de.dj.djm.parser.libs.StringLibs.concatEqu;
import static de.dj.djm.parser.libs.StringLibs.enquote;
import static de.dj.djm.parser.api.attributes.Attributes.LOAD;

public class Load extends AttributeBase<Undefined> {
    public Load() {
        this(LOAD);
    }

    protected Load(String attributeName) {
        super(attributeName, Undefined.get());
    }

    @Override
    public String format() {
        return concatEqu(getAttributeName(), enquote(""));
    }
}
