package de.dj.djm.parser.api.elements;

import de.dj.djm.parser.api.Formattable;
import de.dj.djm.parser.api.attributes.Attribute;
import de.dj.djm.parser.api.attributes.AttributeBase;
import de.dj.djm.parser.impl.attributes.AttributeGenerator;
import de.dj.djm.utils.impl.generators.IdGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static de.dj.djm.parser.libs.StringPool.*;

public abstract class ElementBase implements Element {
    private final int id;
    private final String _elementName;
    private List<Attribute> _attributes;
    private final List<Element> _children;
    private Element _parent;

    public String getElementName() {
        return _elementName;
    }

    @Override
    public List<Attribute> getAttributes() {
        return _attributes;
    }

    public ElementBase(String elementName) {
        this(elementName, null);
    }

    protected ElementBase(String elementName, List<Attribute> attributes) {
        _elementName = elementName;
        _children = new ArrayList<>();
        _attributes = attributes;
        _parent = null;
        id = IdGenerator.getInt();
    }

    public int getId() {
        return id;
    }

    protected String getAttributeString() {
        if(_attributes == null) throw new RuntimeException("Attributes were not initialized: " + _elementName);
        String attributes = getAttributes()
                .stream()
                .map(attribute -> attribute.format())
                .collect(Collectors.joining(" "));
        return attributes;
    }

    @Override
    public String getOpenTag() {
        if(isSelfClosing()) {
            return TAG_OPEN + getElementName() + " " + getAttributeString() + TAG_CLOSE_END + "\n";
        } else {
            return TAG_OPEN + getElementName() + " " + getAttributeString() + TAG_CLOSE_SINGLE + "\n";
        }
    }

    @Override
    public String getSubElements() {
        if(isSelfClosing()) {
            return "";
        } else {
            return _children.stream().map(child -> child.getText()).collect(Collectors.joining());
        }
    }

    @Override
    public String getCloseTag() {
        if(isSelfClosing()) {
            return "";
        } else {
            return TAG_CLOSE_START + getElementName() + TAG_CLOSE_SINGLE + "\n";
        }
    }

    @Override
    public String getText() {
        String text = "";
        text += getOpenTag();
        text += getSubElements();
        text += getCloseTag();
        return text;
    }

    @Override
    public Element getParent() {
        return _parent;
    }

    @Override
    public void setParentFinal(Element parent) {
        if( _parent == null ) setParent(parent);
    }

    private void setParent(Element parent) {
        this._parent = parent;
    }

    @Override
    public List<Element> getChildren() {
        return _children;
    }

    @Override
    public void addChild(Element element) {
        _children.add(element);
    }

    @Override
    public void addAttribute(Attribute entry) {
        if(_attributes == null) throw new RuntimeException("Attributes were not initialized: " + _elementName);
        _attributes.add(entry);
    }

    public List<Attribute> extractAttributes(String elementString) {
        String cleanedElementString = _cleanElementString(elementString);
        List<Attribute> attributes = new ArrayList<Attribute>();

        if(!"".equals(cleanedElementString)) {
            for(String singleAttribute : cleanedElementString.split("\" ")) {
                String repaired = singleAttribute.endsWith("\"") ? singleAttribute : singleAttribute + "\"";
                Attribute attribute = AttributeGenerator.getAttributeFromString(repaired);
                attributes.add(attribute);
            }
        }
        return attributes;
    }

    @Override
    public void readAttributes(String elementString) {
        _attributes = extractAttributes(elementString);
    }

    private String _cleanElementString(String elementString) {
        String cleanedElementString = elementString;
        cleanedElementString = cleanedElementString.replace(TAG_CLOSE_END, "");
        cleanedElementString = cleanedElementString.replace(TAG_CLOSE_SINGLE, "");
        cleanedElementString = cleanedElementString.replace(TAG_CLOSE_START, "");
        cleanedElementString = cleanedElementString.replace(TAG_OPEN, "");
        cleanedElementString = cleanedElementString.replace(getElementName(), "");
        cleanedElementString = cleanedElementString.trim();
        return cleanedElementString;
    }

    @Override
    public String format() {
        String attributes = getAttributes()
                .stream()
                .map(attribute -> attribute.format())
                .collect(Collectors.joining(" ", " ", " "));
        if(isSelfClosing()) {
            return TAG_OPEN + getElementName() + attributes + TAG_CLOSE_END + "\n";
        }

        if(!isSelfClosing()) {
            String open = TAG_OPEN + getElementName() + attributes + TAG_CLOSE_SINGLE + "\n";
            String close = TAG_CLOSE_START + getElementName() + TAG_CLOSE_SINGLE;

            String children = _children.stream()
                    .map(child -> child.format())
                    .collect(Collectors.joining("\n"));

            return open + children + close;
        }
        throw new RuntimeException("Could not identify format function: " + _elementName);
    }


}
