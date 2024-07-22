package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;

import static de.dj.djm.parser.api.elements.Elements.COLOR;
import static de.dj.djm.parser.api.elements.Elements.INPUT;

public class Input extends ElementBase {
    public Input() {
        super(INPUT);
    }

    @Override
    public boolean isSelfClosing() {
        return true;
    }
}
