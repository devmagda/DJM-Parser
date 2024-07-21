package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.TextInlineElement;

import static de.dj.djm.parser.api.elements.Elements.ONEXIT;
import static de.dj.djm.parser.api.elements.Elements.ONSTART;

public class Onexit extends TextInlineElement {
    public Onexit() {
        super(ONEXIT);
    }
}
