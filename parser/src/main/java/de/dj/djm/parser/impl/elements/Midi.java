package de.dj.djm.parser.impl.elements;

import de.dj.djm.parser.api.attributes.Attribute;
import de.dj.djm.parser.api.elements.ElementBase;
import de.dj.djm.parser.api.elements.Elements;
import de.dj.djm.parser.impl.attributes.text.HwInMixOff;
import de.dj.djm.parser.impl.attributes.text.HwInMixOn;
import de.dj.djm.parser.impl.attributes.text.Sysex;

import java.util.List;

import static de.dj.djm.parser.api.elements.Elements.MIDI;

public class Midi extends ElementBase<Midi> {

    public Midi() {
        super(MIDI);
    }

    @Override
    public boolean isSelfClosing() {
        return false;
    }
}
