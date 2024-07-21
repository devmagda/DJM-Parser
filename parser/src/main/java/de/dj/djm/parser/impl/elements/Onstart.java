package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;
import de.dj.djm.parser.api.elements.TextInlineElement;

import static de.dj.djm.parser.api.elements.Elements.COLOR;
import static de.dj.djm.parser.api.elements.Elements.ONSTART;

public class Onstart extends TextInlineElement {
    public Onstart() {
        super(ONSTART);
    }
}
