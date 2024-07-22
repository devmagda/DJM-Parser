package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;

import static de.dj.djm.parser.api.elements.Elements.LSBIT_INPUT;
import static de.dj.djm.parser.api.elements.Elements.OUTPUT;

public class LsbInput extends ElementBase {
    public LsbInput() {
        super(LSBIT_INPUT);
    }

    @Override
    public boolean isSelfClosing() {
        return true;
    }
}
