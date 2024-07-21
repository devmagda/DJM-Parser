package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;

import static de.dj.djm.parser.api.elements.Elements.DECKS;
import static de.dj.djm.parser.api.elements.Elements.SOUNDCARD;

public class Decks extends ElementBase<Decks> {
    public Decks() {
        super(DECKS);
    }

    @Override
    public boolean isSelfClosing() {
        return false;
    }
}
