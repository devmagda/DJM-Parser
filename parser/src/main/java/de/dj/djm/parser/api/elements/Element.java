package de.dj.djm.parser.api.elements;

import de.dj.djm.parser.api.Formattable;
import de.dj.djm.parser.api.attributes.Attribute;

import java.util.List;

public interface Element extends Formattable {
    Element getParent();
    List<Element> getChildren();
    void addChild(Element element);
    void addAttribute(Attribute entry);
    boolean isSelfClosing();
    void setParentFinal(Element parent);

    void readAttributes(String elementString);
    List<Attribute> getAttributes();
    String getOpenTag();
    String getCloseTag();

    String getSubElements();
    String getText();

    // T from(Document document);
}
