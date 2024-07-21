package de.dj.djm.parser.api.attributes.custom;

import de.dj.djm.parser.impl.attributes.custom.classes.Message;
import de.dj.djm.parser.api.attributes.AttributeBase;

public abstract class MessageAttribute extends AttributeBase<Message> {
    public MessageAttribute(String attributeName, Message attributeValue) {
        super(attributeName, attributeValue);
    }
}
