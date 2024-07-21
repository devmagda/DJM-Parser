package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;

import static de.dj.djm.parser.api.elements.Elements.INPUT;
import static de.dj.djm.parser.api.elements.Elements.OUTPUT;

public class Output extends ElementBase<Output> {
    public Output() {
        super(OUTPUT);
    }

    @Override
    public boolean isSelfClosing() {
        return true;
    }
}
