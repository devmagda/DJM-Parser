package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;

import static de.dj.djm.parser.api.elements.Elements.CONTROL;
import static de.dj.djm.parser.api.elements.Elements.MIDI_DEVICE;

public class Control extends ElementBase {

    protected Control() {
        super(CONTROL);
    }

    @Override
    public boolean isSelfClosing() {
        return false;
    }
}
