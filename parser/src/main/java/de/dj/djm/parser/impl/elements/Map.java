package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;

import static de.dj.djm.parser.api.elements.Elements.COLOR;
import static de.dj.djm.parser.api.elements.Elements.MAP;

public class Map extends ElementBase {
    public Map() {
        super(MAP);
    }

    @Override
    public boolean isSelfClosing() {
        return true;
    }
}
