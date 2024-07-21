package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;

import static de.dj.djm.parser.api.elements.Elements.MIDI_DEVICE;
import static de.dj.djm.parser.api.elements.Elements.MIDI_MAP;

public class MidiMap extends ElementBase<MidiMap> {

    public MidiMap() {
        super(MIDI_MAP);
    }

    @Override
    public boolean isSelfClosing() {
        return false;
    }
}
