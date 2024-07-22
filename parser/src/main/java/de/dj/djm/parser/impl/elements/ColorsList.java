package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;

import static de.dj.djm.parser.api.elements.Elements.COLORS_LIST;
import static de.dj.djm.parser.api.elements.Elements.DECK;

public class ColorsList extends ElementBase {
    public ColorsList() {
        super(COLORS_LIST);
    }

    @Override
    public boolean isSelfClosing() {
        return false;
    }
}
