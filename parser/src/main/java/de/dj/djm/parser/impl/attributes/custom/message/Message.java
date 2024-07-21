package de.dj.djm.parser.impl.attributes.custom.message;

import de.dj.djm.parser.api.attributes.custom.MessageAttribute;

import static de.dj.djm.parser.api.attributes.Attributes.MESSAGE;

public class Message extends MessageAttribute {
    public Message(de.dj.djm.parser.impl.attributes.custom.classes.Message text) {
        this(MESSAGE, text);
    }
    protected Message(String attributeName, de.dj.djm.parser.impl.attributes.custom.classes.Message attributeValue) {
        super(attributeName, attributeValue);
    }

    public Message(String value) {
        this(new de.dj.djm.parser.impl.attributes.custom.classes.Message(value));
    }
}
