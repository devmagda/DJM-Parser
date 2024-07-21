package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;

import static de.dj.djm.parser.api.elements.Elements.HELP_URL;
import static de.dj.djm.parser.api.elements.Elements.SOUNDCARD;

public class Soundcard extends ElementBase<Soundcard> {
    public Soundcard() {
        super(SOUNDCARD);
    }

    @Override
    public boolean isSelfClosing() {
        return true;
    }
}
