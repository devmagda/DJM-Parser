package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;

import static de.dj.djm.parser.api.elements.Elements.DECK;
import static de.dj.djm.parser.api.elements.Elements.DECKS;

public class Deck extends ElementBase<Deck> {
    public Deck() {
        super(DECK);
    }

    @Override
    public boolean isSelfClosing() {
        return true;
    }
}
