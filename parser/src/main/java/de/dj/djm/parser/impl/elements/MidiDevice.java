package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.elements.ElementBase;

import static de.dj.djm.parser.api.elements.Elements.MIDI;
import static de.dj.djm.parser.api.elements.Elements.MIDI_DEVICE;

public class MidiDevice extends ElementBase<MidiDevice> {

    public MidiDevice() {
        super(MIDI_DEVICE);
    }

    @Override
    public boolean isSelfClosing() {
        return false;
    }
}
