package de.dj.djm.parser.api.elements;

import de.dj.djm.parser.api.Formattable;
import de.dj.djm.parser.api.attributes.Attribute;

import java.util.List;

public interface Element<T> extends Formattable {
    Element getParent();
    List<Element> getChildren();
    void addChild(Element element);
    void addAttribute(Attribute entry);
    boolean isLeaf();
    boolean isSelfClosing();
    void setParentFinal(Element parent);

    void readAttributes(String elementString);

    // T from(Document document);
}
