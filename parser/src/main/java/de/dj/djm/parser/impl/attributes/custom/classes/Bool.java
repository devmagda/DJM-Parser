package de.dj.djm.parser.impl.attributes.custom.classes;

import de.dj.djm.parser.api.Formattable;
import de.dj.djm.parser.libs.StringPool;

import static de.dj.djm.parser.libs.StringLibs.enquote;

public class Bool implements Formattable {
    protected final boolean _bool;
    public Bool(boolean bool) {
        this._bool = bool;
    }
    @Override
    public String format() {
        return _bool ? StringPool.TRUE : StringPool.FALSE;
    }

    public boolean isBool() {
        return _bool;
    }
}
