package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.Element;
import de.dj.djm.parser.api.elements.ElementBase;
import org.w3c.dom.Document;

import static de.dj.djm.parser.api.elements.Elements.COLOR;
import static de.dj.djm.parser.api.elements.Elements.COLORS_LIST;

public class Color extends ElementBase<Color> {
    public Color() {
        super(COLOR);
    }

    @Override
    public boolean isSelfClosing() {
        return true;
    }
}
