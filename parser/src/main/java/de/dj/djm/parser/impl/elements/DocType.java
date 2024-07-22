package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;

import static de.dj.djm.parser.api.elements.Elements.COLOR;
import static de.dj.djm.parser.libs.StringPool.DOC_TYPE;

public class DocType extends ElementBase {
    private final String _text;

    public DocType(String text) {
        super("");
        _text = text;
    }

    public String getText() {
        return _text;
    }

    @Override
    public boolean isSelfClosing() {
        return true;
    }

    @Override
    public String format() {
        return _text;
    }
}
