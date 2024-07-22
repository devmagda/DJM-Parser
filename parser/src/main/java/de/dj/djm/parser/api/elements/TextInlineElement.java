package de.dj.djm.parser.api.elements;

import de.dj.djm.parser.impl.attributes.custom.classes.Text;

import static de.dj.djm.parser.libs.StringPool.*;

public abstract class TextInlineElement extends ElementBase {
    private String _text;

    protected TextInlineElement(String elementName) {
        super(elementName);
        _text = "";
    }

    public void setText(String _text) {
        this._text = _text;
    }

    @Override
    public boolean isSelfClosing() {
        return true;
    }

    @Override
    public String format() {
        String openTag =  TAG_OPEN + getElementName() + TAG_CLOSE_SINGLE;
        String closeTag = TAG_OPEN + getElementName() + TAG_CLOSE_END;
        return openTag + _text + closeTag;
    }
}
