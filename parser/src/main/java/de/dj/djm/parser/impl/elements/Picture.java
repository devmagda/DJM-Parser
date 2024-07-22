package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.Element;
import de.dj.djm.parser.api.elements.TextInlineElement;
import static de.dj.djm.parser.libs.StringPool.*;

import java.util.List;
import java.util.stream.Collectors;

import static de.dj.djm.parser.api.elements.Elements.PICTURE;

public class Picture extends TextInlineElement {
    protected Picture() {
        super(PICTURE);
    }

    @Override
    public String getOpenTag() {
        return TAG_OPEN + getElementName() + TAG_CLOSE_SINGLE + "\n";
    }

    @Override
    public String getSubElements() {
        List<Element> list = getChildren();
        return list.stream().map(e -> e.getText()).collect(Collectors.joining("\n"));
    }

    @Override
    public String getCloseTag() {
        return TAG_CLOSE_START + getElementName() + TAG_CLOSE_SINGLE + "\n";
    }
}
